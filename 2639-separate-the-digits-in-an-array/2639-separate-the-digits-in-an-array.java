class Solution {
    public int[] separateDigits(int[] num) {
        ArrayList<Integer> list=new ArrayList<>();
      
      for(int i=0;i<num.length;i++){
         ArrayList<Integer> res=new ArrayList<>();
        while(num[i]!=0){
            int d=num[i]%10;
            res.add(d);
            num[i]/=10;
        }
        Collections.reverse(res);
        list.addAll(res);
      }
        int narr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            narr[i]=list.get(i);
        }
        return narr;
    }
}