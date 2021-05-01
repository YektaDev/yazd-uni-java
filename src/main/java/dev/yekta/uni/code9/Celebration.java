package dev.yekta.uni.code9;

public class Celebration {
    private final Lamp[] lamps;
    private final int n;

    public Celebration(int n, boolean initialState) {
        this.n = n;
        this.lamps = new Lamp[n];

        for (int i = 0; i < n; i++)
            this.lamps[i] = new Lamp(initialState);
    }

    public Celebration(int n) {
        this(n, false);
    }

    public Celebration showNumber(int m) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(m));

        while (binary.length() < n)
            binary.insert(0,'0');

        for (int i = 0; i < binary.length(); i++)
            this.lamps[i].setState(binary.charAt(i) == '1');

        return this;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder lamps = new StringBuilder(n);

        for (Lamp lamp : this.lamps)
            lamps.append(lamp.getState() ? '*' : 'o');

        return lamps.toString();
    }
}
