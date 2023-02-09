class Solution {
    public int jump(int[] nums) {
       int jumps = 0;
       int curr = 0;
       int max_dist=0;

       for(int i=0 ; i<nums.length-1;i++){
           max_dist = Math.max(max_dist,nums[i]+i);

           if(i==curr){
               curr = max_dist;
               jumps++;
           }
       }
       return jumps;
    }
}