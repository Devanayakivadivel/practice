class Solution {
    public String convertToTitle(int col_num) {
        String res="";
        while(col_num>0){
            col_num--;
           // int d=col_num%26;
            char c=(char )('A'+(col_num%26));
            res=c+res;
            col_num/=26;

        }
        return res;
    }
}