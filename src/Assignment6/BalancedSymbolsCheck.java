package Assignment6;
import java.util.Scanner;
import java.util.Stack;

class BalancedSymbolsCheck {

    static int isMatching(char a, char b) {
        if ((a == '{' && b == '}')
                || (a == '[' && b == ']')
                || (a == '(' && b == ')') || a == 'X') {
            return 1;
        }
        return 0;
    }


    static int isBalanced(String s, Stack<Character> ele, int ind) {


        if (ind == s.length()) {
            if (ele.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        char topEle;


        int res;


        if (s.charAt(ind) == '{'
                || s.charAt(ind) == '('
                || s.charAt(ind) == '[') {
            ele.push(s.charAt(ind));
            return isBalanced(s, ele, ind + 1);
        }
        else if (s.charAt(ind) == '}'
                || s.charAt(ind) == ')'
                || s.charAt(ind) == ']') {


            if (ele.size() == 0) {
                return 0;
            }

            topEle = ele.peek();
            ele.pop();

            if (isMatching(topEle, s.charAt(ind)) == 0) {
                return 0;
            }

            return isBalanced(s, ele, ind + 1);
        }
        else if (s.charAt(ind) == 'X') {
            Stack<Character> tmp = new Stack<>();
            tmp.addAll(ele);
            tmp.push(s.charAt(ind));
            res = isBalanced(s, tmp, ind + 1);
            if (res == 1) {
                return 1;
            }
            if (ele.size() == 0) {
                return 0;
            }
            ele.pop();
            return isBalanced(s, ele, ind + 1);
        }
        return 1;
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(" Enter any mathematical expression and parenthesis");
        Scanner input= new Scanner(System.in);

        String s = input.next();
        Stack<Character> ele = new Stack<Character>();

        if (isBalanced(s, ele, 0) != 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}