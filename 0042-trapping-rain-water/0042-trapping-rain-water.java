class Solution {
    public int trap(int[] height) {
       int l=0;
       int r=height.length-1;
       int lhb= height[l];
       int rhb=height[r];
       int ans=0;
       while(l<=r){
        if(lhb<=rhb){
            if(height[l]>=lhb)
                lhb=height[l];
            else
                ans+=lhb-height[l];
            l++;
        }
        else{
            if(height[r]>=rhb)
                rhb=height[r];
            else
                ans+=rhb-height[r];
            r-- ;   
            }
        }
       return ans;
    }
}