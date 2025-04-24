class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            switch(c){
                
                case '}': if(!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                case ')': if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    }   
                    else {
                        return false;
                    }
                    break;
                case ']': if(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                    }
                      else {
                        return false;
                    }
                    break;
                default: stack.push(c);
              
            }
        }
            return stack.isEmpty();


    }
}