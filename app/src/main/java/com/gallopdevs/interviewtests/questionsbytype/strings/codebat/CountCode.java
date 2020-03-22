package com.gallopdevs.interviewtests.questionsbytype.strings.codebat;

public class CountCode {
    public static int countCode(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length() - 3; i++) {
//            System.out.println(s.substring(i, i + 4).replace(s.charAt(2), 'd'));
//            if (s.substring(i, i + 4).replace(s.charAt(2), 'd').equals("code")) {
//                count++;
//                i += 3;
//            }
//        }
//        return count;
        if (s.length() < 4) return 0;
        if (s.substring(0, 4).replace(s.charAt(2), 'd').equals("code")) {
            return 1 + countCode(s.substring(4));
        }
        return countCode(s.substring(4));
    }
}
