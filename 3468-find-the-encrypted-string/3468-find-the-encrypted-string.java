class Solution {
    public String getEncryptedString(String s, int k) {
        char[] arr =s.toCharArray();
        //int c=arr.length;
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        return new String(arr);
    }
    public  void reverse(char [] arr,int s,int e){
        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}