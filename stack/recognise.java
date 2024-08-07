import java.util.Stack;

public class recognise {

    public static boolean isValidString(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse through the string and push characters into the stack
        for (int i = 0; i < s.length() / 2; i++) {
            stack.push(s.charAt(i));
        }

        // Check if the string is a palindrome
        int mid = s.length() / 2;
        for (int i = (s.length() + 1) / 2; i < s.length(); i++) {
            if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {"aca", "abcba", "abbcbba", "hello", "abccba"};

        for (String str : testStrings) {
            if(isValidString(str)) {
                System.out.println(str + " is a valid string.");
            } else {
                System.out.println(str + " is an invalid string.");
            }
        }
    
    }
}