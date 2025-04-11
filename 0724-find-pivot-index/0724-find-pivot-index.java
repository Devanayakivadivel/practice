class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0;
        int rsum=0;
        int totals=0;
        for(int i=0;i<nums.length;i++){
            totals+=nums[i];}
            for(int i=0;i<nums.length;i++){
            rsum=totals-lsum-nums[i];

            if(lsum==rsum)
            return i;
            lsum+=nums[i];
        }
        return -1;
    }
}
