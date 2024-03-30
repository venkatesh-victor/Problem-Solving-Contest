import java.util.Stack;

public class DecodeSequence {

//        IIDDIDID  ——>  125437698
//        IDIDII    ——>  1325467
//        DDDD      ——>  54321
//        IIII      ——>  12345
    public static String decodeSequence(String in) {
        int n = in.length();
        int[] result = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);

            if (i == n || in.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result[j] = stack.pop();
                    j++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeSequence("IIDDIDID"));
        System.out.println(decodeSequence("IDIDII"));
        System.out.println(decodeSequence("DDDD"));
        System.out.println(decodeSequence("IIII"));
    }
}
