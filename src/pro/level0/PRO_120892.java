package pro.level0;

public class PRO_120892 {
    public static void main(String[] args) {
        String result = solution("dfjardstddetckdaccccdegk", 4);

        if (result.equals("attack")) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

    public static String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i+=code) {
            result.append(cipher.substring(i, i + 1));
        }

        return result.toString();
    }

}
