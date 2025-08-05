package string;

public class StrongPasswordCheckerII {
    public static void main(String[] args) {
        String password="Me+You--IsMyDream";
        System.out.println(strongPasswordCheckerII(password));
    }
    public static boolean strongPasswordCheckerII(String password) {

                if (password.length() < 8) return false;

                boolean isLower = false, isUpper = false, isDigit = false, isSymbol = false;
                String symbols = "!@#$%^&*()-+";

                for (int i = 0; i < password.length(); i++) {
                    char curr = password.charAt(i);

                    // Check types
                    if (Character.isLowerCase(curr)) isLower = true;
                    else if (Character.isUpperCase(curr)) isUpper = true;
                    else if (Character.isDigit(curr)) isDigit = true;
                    else if (symbols.indexOf(curr) != -1) isSymbol = true;

                    // Check adjacent duplicates
                    if (i > 0 && password.charAt(i) == password.charAt(i - 1)) return false;
                }

                return isLower && isUpper && isDigit && isSymbol;
            }
        }


