class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max =0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;}
            else{                               //TC O(N)
                                                //SC O(1)
            count =0;}
           max = Math.max(max,count);
        
    }
    return max;
        
    }
}