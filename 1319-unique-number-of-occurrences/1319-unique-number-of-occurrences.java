class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> s1 =  new HashSet<>();
        for(int item: arr) {
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        for(int item: map.values()) {
            if(!s1.add(item)) {
                return false;
            }
        }

        return true;
    }
}