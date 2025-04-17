class Solution {
    public long maximumTripletValue(int[] nums) {
      long maxtri=0;
        long maxele=0;
        long maxdiff=0;
        for(int n:nums){
            maxtri=Math.max(maxtri,maxdiff*n);
            maxdiff=Math.max(maxdiff,maxele-n);
            maxele=Math.max(maxele,n);
        }
      return maxtri;
    }
}