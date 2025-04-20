class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        int max=Arrays.stream(nums).max().orElse(-1);
        int min=Arrays.stream(nums).min().orElse(-1);
        int ans=0;
        for(int i=0;i<nums.length;i++){
   if(nums[i]!=max&&nums[i]!=min)
   return nums[i];
   
       
        }
        return -1;
    }
}