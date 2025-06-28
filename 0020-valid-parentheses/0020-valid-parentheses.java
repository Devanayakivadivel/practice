class Solution {
    public boolean isValid(String s) {
        Stack<Character> ele=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ele.isEmpty()){
                char last=ele.peek();
                if(pair(last,c)){
                    ele.pop();
                    continue;
                }
            }
            ele.push(c);
        }
        return ele.isEmpty();
    }
    private boolean pair(char last,char c){
        return (last == '('&& c==')' )||(last=='{'&&c=='}')||(last=='['&&c==']');
    }
}
