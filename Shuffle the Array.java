class Solution {
    public int[] shuffle(int[] nums, int n) {

       // TC O(n)
       // SC O(n)
     int x=0; int y=n;  
     int [] ans = new int [nums.length];
   for(int i=0; i<nums.length; i++){
       if(i%2==0){
           ans[i] = nums[x];
           x++;
       }
       else {
           ans[i] = nums[y];
           y++;
       }

   }
     return ans;
    }
}