class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num>0 || sum>9) {
            if (num==0) {
                int temp=num; 
                num=sum;
                sum=temp;
            }
            int d= num%10; 
            sum+=d;         
            num/=10;        
        }
        return sum; 
    }
}
