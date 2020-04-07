package com.gallopdevs.interviewtests.questionsbytype.recursive.codebat;

public class BunnyEarsVariation {

    public static int bunnyEarsVariation(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 1) return 2 + bunnyEarsVariation(bunnies - 1);
        else return 3 + bunnyEarsVariation(bunnies - 1);
    }
}
