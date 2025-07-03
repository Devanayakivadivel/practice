class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set=new HashSet<>();
        int ind=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(ind));
                ind++;
            }
            set.add(s.charAt(i));
            max=Math.max( i-ind+1 ,max);
        }
        return max;
    }
}