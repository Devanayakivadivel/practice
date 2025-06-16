class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // boolean flag=false;
        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //  if(nums[i]==nums[i+1]){
        //        flag=true;
        //        break;
        //        }
        //      }
        // return flag ;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
            if(set.size()==nums.length)
            return false;
        
            return true;
     }
}