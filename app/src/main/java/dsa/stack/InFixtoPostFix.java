package dsa.stack;

import java.util.Stack;

public class InFixtoPostFix {

    public static void main(String[] args){

        String ip = "2+3*5/4-1";
        String res = solution(ip);
        System.out.println(res);

    }

    public static String solution(String in){
        StringBuilder postFix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for(char ch : in.toCharArray()){
            if(Character.isDigit(ch)){
                postFix.append(ch);
            } else {
                while(!operatorStack.isEmpty() && precedence(ch) <= precedence(operatorStack.peek())){
                    postFix.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        while(!operatorStack.isEmpty()){
            postFix.append(operatorStack.pop());
        }

        return postFix.toString();
    }

    public static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}
