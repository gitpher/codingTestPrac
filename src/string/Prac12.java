package string;

public class Prac12 {
    public static void main(String[] args) {

        String instr = "#****###**#####**#####**##**";
        int inint = 4;
        String answer = "";


        for (int i = 0; i < inint; i++) {
            String tmp = instr.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp,2);
            answer += (char) num;
            instr = instr.substring(7);
        }

        System.out.println(answer);
















    }



}
