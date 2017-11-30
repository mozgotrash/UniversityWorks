package lw1;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by mozgotrash on 30.11.17.
 */
public class BracketsAnalyzer {
    public static boolean analyze(String brackets){
        char[] ch = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        int k = 0;

        switch(ch[0]){
            case '}': return false;
            case ')': return false;
            case ']': return false;
        }

        while(k <= ch.length){
            switch(ch[k]){
                case '{': stack.push('}');
                    break;
                case '[': stack.push(']');
                    break;
                case '(': stack.push(')');
                    break;
            }
            if(k == ch.length - 1){
                break;
            }

            try{
                if(ch[k+1] == '{'
                        || ch[k+1] == '('
                        || ch[k+1] == '['
                        || ch[k+1] == stack.pop()
                        ){
                    k++;
                }else {
                    return false;
                }
            }catch(EmptyStackException e){
                return false;
            }
        }

        return stack.empty();
    }
}
