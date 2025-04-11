class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        if(needle.isEmpty())
        return 0;
        for(int i=0;i<=h-n;i++){
            boolean f=true;
            for(int j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    f=false;
                    break;
                }
            }
             if(f)
                return i;
           
        }
        return -1;
    }
}