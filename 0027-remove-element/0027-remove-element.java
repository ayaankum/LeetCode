class Solution {
    public int removeElement(int[] nums, int n) {
      
      int i =0;
      for(int val : nums){
          if(val != n){
              nums[i++] = val;
          }
      }
        return i;
    }
}