class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);  // sort in lexicographical order
      String start = strs[0];
      String last = strs[strs.length-1];
      int id = 0;
      for(int i=0; i<start.length() && i<last.length(); i++){
          if(start.charAt(i) == last.charAt(i)){
              id++;
          }
          else{
              break;
          }
      }
      return start.substring(0,id);
    }
}