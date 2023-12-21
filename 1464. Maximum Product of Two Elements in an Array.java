class Solution {
    public int maxProduct(int[] nums) { 
        Arrays.sort(nums); // TC O(nlog(n)) from java14 onwards
                           // SC O(n)
        System.out.println(nums[nums.length-2]);
        return ((nums[nums.length-1] -1)* (nums[nums.length-2]-1));
    }
}