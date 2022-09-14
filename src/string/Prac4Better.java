//package string;
//
//import java.util.ArrayList;
//
//public class Prac4Better {
//    public static void main(String[] args) {
//
//        String[] strings = new String[4];
//        strings[0] = "good";
//        strings[1] = "hello";
//        strings[2] = "world";
//        strings[3] = "goodbye";
//
//        ArrayList<String> answer = new ArrayList<>();
//
//        for (String s : strings) {
//            char[] c = s.toCharArray();
//            int lt = 0, rt = s.length() - 1;
//            while (lt < rt) {
//                char tmp = c[lt];
//                c[lt] = c[rt];
//                c[rt] = tmp;
//                lt++; rt--;
//            }
//            String a = String.valueOf(c);
//            answer.add(a);
//        }
//
//        System.out.println(answer);
//
//
//
//    }
//}
