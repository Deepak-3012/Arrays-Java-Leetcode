// TC - O(n)
// SC - O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int next_element = target-nums[i];
            if(hm.containsKey(next_element)){
                return new int[] {i,hm.get(next_element)};
                }
                hm.put(nums[i],i);
            }
      return new int[] {};
        }
     }
       
  