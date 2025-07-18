class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first =-1;
        int last =-1;
        
        int n=nums.length;   int k=target;
        for(int i=0;i<n;i++){
            if(nums[i]==k){
            first=i;
            break;}
        }
        
        for(int i=n-1;i>=0;i--){
            if(nums[i]==k){
            last=i;
            break;}
        }
        if(first==-1)
        return new int[]{-1,-1};
        else return new int[]{first,last};
    }
}