class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean left=(i==0)||nums[i]>nums[i-1];
            boolean right=(i==n-1)||nums[i]>nums[i+1];
        
        if(right&&left)
        return i;
        }
        return 0;
    }
}