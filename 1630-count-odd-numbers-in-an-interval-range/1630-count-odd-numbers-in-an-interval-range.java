class Solution {
    public int countOdds(int low, int high) {
        int count = 0;

        // Start at the first odd number in the range
        if (low % 2 == 0) {
            low++; // Move to the next odd number
        }

        // Increment by 2 to skip even numbers
        for (int i = low; i <= high; i += 2) {
            count++; // Only odd numbers are processed
        }

        return count;
    }
}
