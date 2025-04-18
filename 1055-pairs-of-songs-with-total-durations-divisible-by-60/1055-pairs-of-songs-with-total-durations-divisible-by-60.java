class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] mod = new int[60];
        for (int t : time) {
            mod[t % 60]++; // Count the frequencies of remainders
        }

        long res = 0; // Use long to avoid overflow

        // Handle the pairs where remainder is 0
        res += ((long) mod[0] * (mod[0] - 1)) / 2;

        // Handle the pairs where remainder is 30
        res += ((long) mod[30] * (mod[30] - 1)) / 2;

        // Handle pairs for other remainders
        for (int i = 1; i < 30; i++) {
            res += (long) mod[i] * mod[60 - i];
        }

        return (int) res; // Convert back to int for the final result
    }
}
