package problems.brackets;

import com.google.common.base.Preconditions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class BalancedPartsRemover {

    public static void print(String str) {
        Objects.requireNonNull(str);
        System.out.println(Arrays.toString(remove(str).toArray()));
    }

    public static Stack<Character> remove(String str) {
        Objects.requireNonNull(str);
        int strLength = str.length();
        Preconditions.checkArgument((strLength % 2) == 0, "String has to be even.");
        Preconditions.checkArgument(str.matches("^[()]*$"), "Only '(' & ')' allowed.");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < strLength; i++) {
            char c = str.charAt(i);
            if (c == ')' && !stack.isEmpty()) {
                if (stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack;
    }
}
