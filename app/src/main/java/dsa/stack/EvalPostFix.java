package dsa.stack;

import java.util.Stack;

public class EvalPostFix {

   // 2 3 + 5 * 4 - 3 /
    public static void main(String[] args){

        String in = "23*4+5-";
        int res =solution(in);
        System.out.println(res);
  }


    public static int solution(String in) {
// 2 3 + 5 * 4 - 3 /
        int res = 0;  // 25

        Stack<Integer> stack = new Stack<>();  // 25 4
        for (char ch : in.toCharArray()) {   //   -
            System.out.println(ch);
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            } else {

                    if (ch == '+') {
                        res = stack.pop() + stack.pop();
                    } else if (ch == '-') {

                        res = -stack.pop() + stack.pop();
                    } else if (ch == '*') {

                        res = stack.pop() * stack.pop();
                    } else if (ch == '/') {

                        res = 1/stack.pop() * stack.pop();
                    }

                stack.push(res);
            }
        }
        return stack.pop();
    }
}
