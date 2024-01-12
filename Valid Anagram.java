// TC -  O(n)
// SC -  O(1) we are using an extra array but the array size is constant(26 always). So, it is independent of the input size
class Solution {
    public boolean isAnagram(String s, String t) {
       int [] arr = new int[26];

       for(char x: s.toCharArray()){
           arr[x-'a']++; // this will give the offset value
       }
       for(char x : t.toCharArray()){
           arr[x-'a']--;

       }
       for(int x : arr){
           if(x!=0)
           return false;
          }
          return true;
    }
}