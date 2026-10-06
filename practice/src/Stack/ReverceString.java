package Stack;

import java.util.Stack;
import java.util.*;

public class ReverceString {
    public static void main(String[] args) {
        String str = "abcd";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

//        String reversed = "";
//        while(!stack.isEmpty()){
//            reversed += stack.pop();
//        }
//        System.out.println(reversed);

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
