class Solution {
    public int[] twoSum(int[] nums, int target) {
   int l=nums.length;
   for(int i=1;i<l;i++){
    for(int j=i;j<l;j++){
        if(nums[j]+nums[j-i]==target){
            return new int []{j-i,j};
        }
    }
   }
     return nums;

       }
    }

    