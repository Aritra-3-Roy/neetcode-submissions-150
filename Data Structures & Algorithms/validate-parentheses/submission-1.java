class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        // List<Character>closingBracket = new ArrayList<>();
        // closingBracket.add(')');
        // closingBracket.add('}');
        // closingBracket.add(']');

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }
                
                if((stack.peek() == '(' && ch != ')')
                || (stack.peek() == '{' && ch != '}')
                || (stack.peek() == '[' && ch != ']')){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
