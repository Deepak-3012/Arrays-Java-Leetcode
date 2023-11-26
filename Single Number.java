class Solution {
    public int singleNumber(int[] nums) {
        // using xor operation(bit manipulation)
        int res = 0;				// TC O(N) and SC O(1)
        for(int i=0;i<nums.length;i++){
            res = nums[i] ^ res;
        }
        return res;
    }
}