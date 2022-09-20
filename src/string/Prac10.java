package string;

import java.util.Arrays;

public class Prac10 {


    public static void main(String[] args) {


        String str = "teachermode";
        char in = 'e';

        // 거리 숫자 배열
        int[] ints = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == in) {
                p=0;
                ints[i] = p;
            } else {
                p++;
                ints[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == in) {
                p=0;
            } else {
                p++;
                ints[i] = Math.min(ints[i], p);
            }
        }

        for (int i : ints) {
            System.out.print(i + "");
        }

    }





}
