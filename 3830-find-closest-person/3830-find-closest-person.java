class Solution {
    public int findClosest(int x, int y, int z) {
      int ans=Math.abs(z-x);
      int ans2=Math.abs(z-y);
       if(ans==ans2)
       return 0;
        if(ans<ans2)
       return 1;
      
       return 2;
    }
}