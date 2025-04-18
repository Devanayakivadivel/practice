class Solution {
    public boolean canJump(int[] nums) {
        int reach=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=reach){
                reach=i;
            }
        }
        return reach==0;
    }
}