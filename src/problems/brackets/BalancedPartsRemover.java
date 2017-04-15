package problems.brackets;

import com.google.common.base.Preconditions;

import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mtumilowicz on 2017-03-30.
 */
public class BalancedPartsRemover {

    public static void print(String str) {
        Objects.requireNonNull(str);
        System.out.println(remove(str));
    }
    
    public static String remove(String str) {
        return removeAndReturnAsStack(str).toString();
    }

    public static Stack<Character> removeAndReturnAsStack(String str) {
        Objects.requireNonNull(str);
        Preconditions.checkArgument(str.matches("^[()]*$"), "Only '(' & ')' allowed.");
        Stack<Character> stack = new Stack<Character>() {
            public String toString() {
                Iterator<Character> it = iterator();
                if (! it.hasNext())
                    return "empty";

                StringBuilder sb = new StringBuilder();
                for (;;) {
                    sb.append(it.next());
                    if (! it.hasNext())
                        return sb.toString();
                }
            }
        };

        for (int i = 0; i < str.length(); i++) {
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
