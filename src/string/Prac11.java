package string;

public class Prac11 {
    public static void main(String[] args) {

        String in = "KKHSSSSSSSE";
        in = in + " ";
        String answer = "";

        int cnt = 1;

        for(int i=0; i<in.length()-1; i++) {
            if (in.charAt(i) == in.charAt(i + 1)) {
                cnt++;
            } else {
                answer += in.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;

            }

        }

        System.out.println(answer);

    }

}
