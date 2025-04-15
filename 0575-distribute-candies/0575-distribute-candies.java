class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> candy=new HashSet<>();
        for(int i:candyType){
            candy.add(i);
        }
        return Math.min(n/2,candy.size());
    }
}