// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>(); // create an empty stack
//         for (char c : s.toCharArray()) { // loop through each character in the string
//             if (c == '(') // if the character is an opening parenthesis
//                 stack.push(')'); // push the corresponding closing parenthesis onto the stack
//             else if (c == '{') // if the character is an opening brace
//                 stack.push('}'); // push the corresponding closing brace onto the stack
//             else if (c == '[') // if the character is an opening bracket
//                 stack.push(']'); // push the corresponding closing bracket onto the stack
//             else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
//                 // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
//                 // does not match the closing bracket, the string is not valid, so return false
//                 return false;
//         }
//         // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
//         // so the string is valid, otherwise, there are unmatched opening brackets, so return false
//         return stack.isEmpty();
//     }
// }
// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char c : s.toCharArray()){
//             if(c == ')'){
//                 if(st.size()==0 || st.pop()!='(') return false;
//             } else if(c == '}'){
//                 if(st.size()==0 || st.pop()!='{') return false;
//             } else if(c == ']'){
//                 if(st.size()==0 || st.pop()!='[') return false;
//             } else{
//                 st.push(c);
//             }
//         }
//         if(st.isEmpty()) return true;
//         return false;
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();

//         for(char c : s.toCharArray()){
//             if(c == ')'){
//                 if(st.size()==0 || st.pop()!='(') return false;
//             } else if(c == '}'){
//                 if(st.size()==0 || st.pop()!='{') return false;
//             } else if(c == ']'){
//                 if(st.size()==0 || st.pop()!='[') return false;
//             } else{
//                 st.push(c);
//             }
//         }

//         return st.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String s) {
        //agr opening mila to uska corresponding closing stack me dalo
        //agr closing mila to stack ke top se compare krlo
        Stack<Character> st = new Stack<>();
        char[] cArr = s.toCharArray();
        for(char c: cArr){
            if(c=='(') st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else {
                if(st.size()==0) return false;
                if(c!=st.pop()) return false;
            }
        }
        if(st.size()!=0) return false;
        return true;
    }
}
