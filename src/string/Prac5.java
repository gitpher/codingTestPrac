package string;

public class Prac5 {
    public static void main(String[] args) {

        String in = "a#b!GE*T@S";
        String out = "";


        char[] cs = in.toCharArray();
        int lt = 0, rt = cs.length-1;
        while (lt < rt) {

            if (!Character.isAlphabetic(cs[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(cs[rt])) {
                rt--;
            } else {
                char tmp = cs[lt];
                cs[lt] = cs[rt];
                cs[rt] = tmp;
                lt++; rt--;
            }
        }
        out = String.valueOf(cs);
        System.out.println(out);

    }
}
