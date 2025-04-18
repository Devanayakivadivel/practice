class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        int maxcount=0;
        int res= -1;
        for (int i=0;i<n;i++){
            if (nums[i]%2 == 0) {
               int count=0;
                for (int j=0;j<n;j++) {
                    if (nums[j]==nums[i]) 
                        count++;
                }
                if (count>maxcount || (count==maxcount && nums[i]<res)) {
                    maxcount=count;
                    res=nums[i];
                }
            }
        }
        return res;
    }
}
