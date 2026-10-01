class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n<2)return false;
        Stack<Character> stk = new Stack();
        
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
           
            if(c == '('|| c == '['||c == '{')
             stk.push(c);
           else if(stk.empty())
            return false;
            else 
            {
                char ts = stk.peek();
                if( (c == ')'&& ts != '(') || (c == ']'&& ts != '[') || (c == '}'&& ts != '{') )
                  return false;
                else
                 stk.pop();
            }
      
           
        }
    if(stk.empty())
    return true;
return false;
    }
}