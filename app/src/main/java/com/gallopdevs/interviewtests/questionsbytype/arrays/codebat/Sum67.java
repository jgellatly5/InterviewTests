package com.gallopdevs.interviewtests.questionsbytype.arrays.codebat;

import android.icu.text.RelativeDateTimeFormatter;
import android.media.tv.TvView;

public class Sum67 {
    public static int sum67(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 6) {
                while (i < numbers.length) {
                    if (numbers[i] != 7) {
                        i++;
                    } else {
                        break;
                    }
                }
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
