class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt=0;
        for(int i=n-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                cnt++;
            }
            if(cnt==2){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}