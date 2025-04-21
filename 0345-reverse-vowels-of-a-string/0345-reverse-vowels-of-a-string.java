class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder (s);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char le=sb.charAt(l);
            char ri=sb.charAt(r);
            if(le!='a'&&le!='e'&&le!='i'&&le!='o'&&le!='u'&&le!='A'&&le!='E'&&le!='I'&&le!='O'&&le!='U') {
            l++;
            }
    else if(ri!='a'&&ri!='e'&&ri!='i'&&ri!='o'&&ri!='u'&&ri!='A'&&ri!='E'&&ri!='I'&&ri!='O'&&ri!='U') {
                r--;
            }
            else {
                char temp=sb.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r,temp);
                l++;
                r--;
            }
        }
        return sb.toString();
        }
    }
