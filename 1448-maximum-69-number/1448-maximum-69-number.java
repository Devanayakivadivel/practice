class Solution {
    public int maximum69Number (int num) {
       String str=Integer.toString(num);
       char [] c=str.toCharArray();
       for(int i=0;i<c.length;i++){
         //char c=num.toCharArray(i);
        if(c[i]=='6'){
        c[i]='9';
        break;}
       }
       return  Integer.parseInt(new String(c));
    }
}