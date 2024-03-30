public class CheckDivisible {

    public static void main(String[] args) {

        System.out.println(checkDivisible("769452"));
        System.out.println(checkDivisible("123456758933312"));
        System.out.println(checkDivisible("3635883959606670431112222"));

    }

    public static String checkDivisible(String in) {

        int sum = 0;

        for(int i = 0; i < in.length(); i++) {
            sum += Character.getNumericValue(in.charAt(i));
        }

        return (sum % 3 == 0) ?  "Yes" : "No";
    }

}
