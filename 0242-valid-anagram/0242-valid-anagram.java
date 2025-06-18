class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()){
        //     return  false;
        // }
        // char []ch=s.toCharArray();
        // char []ch1=t.toCharArray();
        // Arrays.sort(ch);
        // Arrays.sort(ch1);
        // return Arrays.equals(ch,ch1);

         Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int i:map.values()){
            if(i!=0)
            return false;
        }
        return true;
       
    }
}