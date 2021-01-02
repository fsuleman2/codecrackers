/******************************************************************************

Given a string containing of just characters '(', ')', '{', '}', '[', ']' and
determine if string is valid or not?
we can say string is said to be valid if 
1. Open brackets must be closed by same type of brackets

2. Open brackets must be closed in correct order

*******************************************************************************/
import java.util.Stack;
public class Main
{
	public static boolean isValid(String str)
	{
	    Stack<Character> st = new Stack<>();
	    //Iterating over the whole String
	    for(int i = 0; i < str.length(); i++)
	    {
	        char ch = str.charAt(i);
	        if(ch == '(' || ch == '[' || ch == '{')
	        {
	            //push the Character into the Stack
	            st.push(ch);
	            System.out.print(ch);
	        }
	        else{
	            if(st.isEmpty()) return false;
	            
	            //check the element at the top of the Stack
	            char p = st.peek();
	            if( ch == ')' && p != '(') return false;
	            else if(ch == ']' && p!= '[') return false;
	            else if(ch == '}' && p!='{') return false;
	            else st.pop();
	        }
	        }
	        // return true if the stack is empty, otherise false
	        return st.isEmpty();
	    }
	
	public static void main(String[] args) {
		String str = "{[(){}[{";
		System.out.println(isValid(str));
	}
}

