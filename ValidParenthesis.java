// Valid parenthesis or not?
// Print valid if the expression has a balanced pair of parenthesis otherwise print invalid.
// Input: 3
// {{()[]{}}}
// ()[]
// ([((]
// Output:
// valid
// valid
// invalid

import java.util.*;

class ValidParenthesis {
    public static boolean isValid(String str) {
        int length = 0;
        while (length != str.length()) {
            length = str.length();
            str = str.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return str.length() == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (isValid(s) == true) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
        sc.close();
    }
}