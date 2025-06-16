class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int t=n;
        while(n>0){
            int a=n%10;
            sum+=a*a;
            n/=10;
        }
         while (t!=1 && t!=4){
            int sum1=0; 
        while(t>0){
            int d=t%10;
            sum1+=d*d;
            t/=10;
        }
        t=sum1;}
        return t==1;
    }
}