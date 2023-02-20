class Solution {
    public int searchInsert(int[] nums, int target) {
        
         if(nums[nums.length-1] < target) {
              return nums.length;
         }
           
           int p1=0 , p2 =1;
           while(p1 < nums.length-1 && p2 <= nums.length-1)
           {
            if(nums[p1] < target && nums[p2]>=target)  {
                 return p2;

            } 
               else{
                    p1++ ; p2++;
               }
           }


       return 0;
      
}
}