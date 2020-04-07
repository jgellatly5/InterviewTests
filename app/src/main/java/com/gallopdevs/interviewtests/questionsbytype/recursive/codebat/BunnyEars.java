package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class BunnyEars {
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;
        return 2 + bunnyEars(bunnies - 1);
    }
}
