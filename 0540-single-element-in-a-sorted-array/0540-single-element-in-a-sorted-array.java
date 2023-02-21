class Solution {
  public int singleNonDuplicate(int[] nums) {
    int l = 0;
    int r = nums.length - 1;
    if(nums.length == 1) return nums[0];

    while (l <= r) {
      if(nums[r] != nums[r-1]) return nums[r];
      else if(nums[l] != nums[l+1]) return nums[l];
      else l=l+2 ; r=r-2;    
    }

    return 0;
  }
}