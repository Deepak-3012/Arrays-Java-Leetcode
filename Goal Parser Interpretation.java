// TC - O(n)
// SC - O(n)
class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
       for(int i=0; i<command.length(); i++){
           if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
           ans.append('o');
           i++;
           }
        else if(command.charAt(i)=='('){
     ans.append("al");
     i+=3;
        }
        else if(command.charAt(i)=='G' ){
           ans.append('G');
        }
        else {
            ans.append(command.charAt(i));
        }
       } 
       return ans.toString();
    }
}