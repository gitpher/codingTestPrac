package string;

import java.util.ArrayList;

public class Prac4 {
    public static void main(String[] args) {

        String[] strings = new String[4];
        strings[0] = "good";
        strings[1] = "tea";
        strings[2] = "hello";
        strings[3] = "world";

        ArrayList<String> answer = new ArrayList<>();
        for (String x : strings) {

            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);

        }


        for (String a : answer) {
            System.out.println(a);
        }



    }
}
