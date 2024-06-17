package pro.level0;

public class PRO_120839 {
    public static void main(String[] args) {
        String result = solution("205");
        if (result.equals("052")) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }
    public static String solution(String admin) {
        char[] arrays = admin.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char array : arrays) {
            if (array == '2') {
                result.append('0');
            } else if (array == '5') {
                result.append('2');
            } else {
                result.append('5');
            }
        }

        return result.toString();

    }
}
