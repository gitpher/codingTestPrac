package string;

public class Prac2 {

    public static void main(String[] args) {

        String str = "StuDy";

        char[] chars = str.toCharArray();

        for (int i=0; i<chars.length; i++) {

            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }

        }

        String result = String.valueOf(chars);

        System.out.println(result);

    }

}
