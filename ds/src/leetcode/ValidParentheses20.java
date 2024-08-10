package leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()("));
    }

    public static boolean isValid(String s) {
        boolean isValid = true;
        Map<Character, Character> complimentryMap = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> syntaxStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if(complimentryMap.containsKey(current)){
                syntaxStack.add(current);
                continue;
            }
            else if(syntaxStack.isEmpty()){
                return false;
            }
            Character prev = syntaxStack.pop();
            if(!current.equals(complimentryMap.get(prev))){
                return false;
            }
        }

        return isValid && syntaxStack.isEmpty();

    }


    public static boolean isValidOld(String s) {
        boolean isValid = true;
        Map<Character, Character> complimentryMap = Map.of('(', ')', '{', '}', '[', ']');
        for (int i = 0; i < s.length(); i++) {
            Character prev = null;
            if(i%2==0){
                prev = s.charAt(i);
                continue;
            }
            Character present = s.charAt(i);
            if(!present.equals(complimentryMap.get(prev))) {
                return false;
            }

        }
        return isValid;
    }
}
