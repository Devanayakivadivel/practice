class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int f=0,ten=0,t=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                f+=1;
            }
            if(bills[i]==10){
                ten+=1;
                if(f>0)
                    f-=1;
                else 
                    return false;
                
            }
            if(bills[i]==20){
                t+=1;
                if(f>=1&&ten>=1){
                    f-=1;ten-=1;
                }
                else if(f>=3)
                f-=3;
                else return false;
            }
        }
        return true;
    }
}