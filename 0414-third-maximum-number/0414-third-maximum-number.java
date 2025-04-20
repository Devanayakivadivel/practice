class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
      int [] ans=Arrays.stream(nums).distinct().toArray();
      int n=ans.length;
      if(n<3)
      return ans[n-1];
      else
      return ans[n-3];
    }
}