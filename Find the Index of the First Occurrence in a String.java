class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            // TC O(n) worst case
            // SC O(1)
            return haystack.indexOf(needle);
        }
        return -1;
    }
}