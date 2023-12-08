class Solution {
    public String longestPalindrome(String s) {
        int start_ind=0;
        int end_ind=1;
        int high;int low;

        // odd even approach (You can also use DP to solve this problem)
        for(int i=0;i<s.length();i++){
            // odd
            low = i;
            high = i+1;
            while(low>=0 && high < s.length() && s.charAt(low) == s.charAt(high) ){
                if(high-low+1>end_ind){
                start_ind = low;
                end_ind = high-low+1;
                }
                low--;
                high++;
                

                
            }
            //even
            low = i-1;
            high = i+1;
                while(low>=0 && high < s.length() && s.charAt(low) == s.charAt(high) ){
                if(high-low+1>end_ind){
                start_ind = low;
                end_ind = high-low+1;
                }
                low--;
                high++;
                

                
            }
        }
        return s.substring(start_ind,start_ind+end_ind);
        
    }
}