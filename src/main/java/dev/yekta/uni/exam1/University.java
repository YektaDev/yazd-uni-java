package dev.yekta.uni.exam1;

public class University {
    private int n;
    private Student[] students;
    private int m;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getM() {
        updateM();
        return m;
    }

    private void updateM() {
        m = (students == null) ? 0 : students.length;
    }

    public University(int n) {
        this.n = n;
        this.students = new Student[0];
    }

    public void addStudent(int stdNo, String name, String family, double[] grades) {
        if (hasStudent(stdNo)) {
            System.out.println(("A student with student number of " + stdNo + " already exists!"));
            return;
        }
        if (isFull()) {
            System.out.println(("The university doesn't have enough space for the new user!"));
            return;
        }

        Student[] newStudents = new Student[m + 1];

        for (int i = 0; i < m + 1; i++) {
            newStudents[i] = (i == m) ? new Student(stdNo, name, family, grades) : students[i];
        }

        students = newStudents;
        updateM();
        System.out.println(this);
    }

    private void swapStudent(int i, int j) {
        Student tmp = students[i];
        students[i] = students[j];
        students[j] = tmp;
    }

    public void swapStudent(Student st1, Student st2) {
        if (students == null || st1 == null || st2 == null || students.length == 0)
            return;
        if (students.length < 2) {
            System.out.println(this);
            return;
        }

        int st1Index = -1;
        int st2Index = -1;

        for (int i = 0; i < m; i++) {
            if (students[i].getStudentNumber() == st1.getStudentNumber())
                st1Index = i;
            else if (students[i].getStudentNumber() == st2.getStudentNumber())
                st2Index = i;

            if (st1Index != -1 && st2Index != -1)
                break;
        }

        if (st1Index != -1 && st2Index != -1) {
            swapStudent(st1Index, st2Index);
            System.out.println(this);
            return;
        }

        System.out.println("One of the students or both of them couldn't be found!");
    }

    public void setGrades(int stdNo, double[] grades) {
        if (!hasStudent(stdNo)) {
            System.out.println(("User does not exist!"));
            return;
        }
        students[indexOf(stdNo)].setGrades(grades);
        System.out.println(this);
    }

    public void sortStdAve() {
        if (students == null || students.length == 0)
            return;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (students[i].getAverage() > students[j].getAverage())
                    swapStudent(i, j);
            }
        }

        System.out.println(this);
    }

    public int indexOf(int stdNo) {
        if (students == null)
            return -1;

        for (int i = 0; i < m; i++) {
            if (students[i].getStudentNumber() == stdNo)
                return i;
        }
        return -1;
    }

    public boolean hasStudent(int stdNo) {
        return indexOf(stdNo) != -1;
    }

    public boolean isFull() {
        return (n == m);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (students != null) {
            for (Student s : students)
                sb.append(s).append(System.lineSeparator());

            if (students.length == 0)
                sb.append("No Students");
        }

        return "University:\n--> n = " + n + "\n--> m = " + m + "\n--> students:\n" + sb;
    }
}
