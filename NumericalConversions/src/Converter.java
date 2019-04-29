public class Converter {

    public static String binaryToDecimal(String number) {
        Integer result = 0;
         for (int i = 0; i < number.length(); i++) {
             if (number.charAt(i) == '1') {
                result += (int) Math.pow(2, (number.length() - i - 1));
             }
         }
        return result.toString();
    }

    public static String decimalToBinary(String number) {
        int convert = Integer.parseInt(number);
        StringBuilder beforeReverse = new StringBuilder();

        while (convert > 0) {
            if (convert % 2 == 1) {
                beforeReverse.append("1");
            } else {
                beforeReverse.append("0");
            }
            convert /= 2;
        }

        String reverse = beforeReverse.toString();
        StringBuilder afterReverse = new StringBuilder();

        for (int i = reverse.length() - 1; i >= 0; i--) {
            afterReverse.append(reverse.charAt(i));
        }

        return afterReverse.toString();
    }
}
