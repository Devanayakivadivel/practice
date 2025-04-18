class Solution {
    public boolean buddyStrings(String s, String goal) {
       if(s.length()!=goal.length()) return false;
       if(s.equals(goal)){
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
            if(arr[c-'a']>1) return true;
        }
        return false;
       }
        List <Integer> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)) list.add(i);
        }
        char c[]=s.toCharArray();
        if(list.size()==2){
            char ch=c[list.get(0)];
            c[list.get(0)]=c[list.get(1)];
            c[list.get(1)]=ch;
            String ss=new String(c);
            return ss.equals(goal);
        }

     else{
       return false;
     }

    }
}