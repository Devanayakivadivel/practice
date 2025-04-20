class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        if(n<3)
        return false;

        while(left<n-1){
            if(arr[left]<arr[left+1])
            left++;
            else
            break;
        }

        if(left==n-1)
        return false;

        while(right>0){
            if(arr[right]<arr[right-1])
            right--;
            else
            break;
        }

        if(right==0)
        return false;
        
       return left==right;
        
    }
}
