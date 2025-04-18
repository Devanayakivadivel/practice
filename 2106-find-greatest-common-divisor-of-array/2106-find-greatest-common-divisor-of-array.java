class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().orElse(-1);
        int min=Arrays.stream(nums).min().orElse(-1);
        int gcd=1;
        for(int i=1;i<=min && i<=max;i++){
            if(min%i==0 && max%i==0)
            gcd=i;
        }
        return gcd;
    }
}