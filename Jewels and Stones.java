class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count=0;
        Set <Character> hs = new HashSet<>();
        for( char jewel : jewels.toCharArray()){
          hs.add(jewel);            
        }
        for(char stone : stones.toCharArray()){
          if(hs.contains(stone))
          count++;

        }
        return count;
    }
}