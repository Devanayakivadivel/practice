class Solution {
    public boolean detectCapitalUse(String word) {
        int upc=0;
        int lowc=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c))
            upc++;
            else if(Character.isLowerCase(c))
            lowc++;
        }
        if(upc==word.length()) return true;
        else if(lowc==word.length()) return true;
        else if(upc==1 &&Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}