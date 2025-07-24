class Solution {
    public String longestCommonPrefix(String[] str) {
      
       String res="";
       String first=str[0]; //flower
       for(int i=1;i<str.length;i++){
        res="";
       String current=str[i];
       int len=Math.min(first.length(),current.length());
       for(int j=0;j<len;j++){
        if(first.charAt(j)==current.charAt(j))
        res+=first.charAt(j);
        else
        break;
       }
       first=res;
       }
     return first;
    }
}