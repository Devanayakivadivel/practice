class Solution {
    public int xorOperation(int n, int start) {
       int res=0;
       for(int i=0;i<n;i++){
        int ans=start+2*i;
        res^=ans;
       }
       return res;
    }
}
    