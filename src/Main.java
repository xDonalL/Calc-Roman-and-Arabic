import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static char operator;
    static int resultIndex;
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] charsInput = new char[10];
        for (int i = 0; i < 10; i++) {
            charsInput[i] = input.charAt(i);
            if (input.charAt(i) == '+') {
                operator = '+';
                break;
            }
            if (input.charAt(i) == '-') {
                operator = '-';
                break;
            }
            if (input.charAt(i) == '*') {
                operator = '*';
                break;
            }
            if (input.charAt(i) == '/') {
                operator = '/';
                break;
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(input, "+-*/");
        String token1 = tokenizer.nextToken();
        String token2 = tokenizer.nextToken();
        if (token1.equals("1") || token1.equals("2") || token1.equals("3") || token1.equals("4") || token1.equals("5") ||
                token1.equals("6") || token1.equals("7") || token1.equals("8") || token1.equals("9") || token1.equals("10")) {
            number1 = AcabCalc(token1);
            number2 = AcabCalc(token2);
            result = result(number1, number2);
            System.out.println(result);
        } else {
            number1 = RimCalc(token1);
            number2 = RimCalc(token2);
            result = result(number1, number2);
            System.out.println(rimNumbers[result]);
        }
    }
    static int result (int number1, int number2) {
        if (operator =='+') {
            return resultIndex = number1 + number2;
        }
        if (operator == '-') {
            return resultIndex = number1 - number2;
        }
        if (operator == '*') {
            return resultIndex = number1 * number2;
        }
        if (operator == '/') {
            return resultIndex = number1 / number2;
        }
        return 0;
    }

    static String[] rimNumbers = {
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    static int AcabCalc(String number) {
        if (number.equals("1")) {
            return 1;
        }
        if (number.equals("2")) {
            return 2;
        }
        if (number.equals("3")) {
            return 3;
        }
        if (number.equals("4")) {
            return 4;
        }
        if (number.equals("5")) {
            return 5;
        }
        if (number.equals("6")) {
            return 6;
        }
        if (number.equals("7")) {
            return 7;
        }
        if (number.equals("8")) {
            return 8;
        }
        if (number.equals("9")) {
            return 9;
        }
        if (number.equals("10")) {
            return 10;
        }
        return 0;
    }

    static int RimCalc(String number) {
        if (number.equals("I")) {
            return 1;
        } else if (number.equals("II")) {
            return 2;
        } else if (number.equals("III")) {
            return 3;
        } else if (number.equals("IV")) {
            return 4;
        } else if (number.equals("V")) {
            return 5;
        } else if (number.equals("VI")) {
            return 6;
        } else if (number.equals("VII")) {
            return 7;
        } else if (number.equals("VIII")) {
            return 8;
        } else if (number.equals("IX")) {
            return 9;
        } else if (number.equals("X")) {
            return 10;
        }
        return 0;
    }
}