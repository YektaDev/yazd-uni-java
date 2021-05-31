/*
 * Copyright © 2021 Ali Khaleqi Yekta, All Rights Reserved.
 *
 * Author: Ali Khaleqi Yekta [YektaDev]
 * Website: https://Yekta.Dev
 * Email: Me@Yekta.Dev
 */

package dev.yekta.uni.code15;

public class Master extends Person {
    private int id;
    private int lessonId;

    public Master(String name, String email, int id, int lessonId) {
        super(name, email);
        this.id = id;
        this.lessonId = lessonId;
    }

    public final int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public final int getLessonId() {
        return lessonId;
    }

    public final void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }
}
