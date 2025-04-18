class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int maxcount=0;
        int maxele=nums[0];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                count++;
            }
            if(count>maxcount){
            maxcount=count;
            maxele=nums[i];
            }
        }
         return maxele ;
    }
}