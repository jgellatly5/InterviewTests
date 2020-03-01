package com.gallopdevs.interviewtests.questionsbytype.recursive;

public class Triangle {
    public static int triangle(int rows) {
        if (rows == 0 || rows == 1) return rows;
        return rows + triangle(rows - 1);
    }
}
