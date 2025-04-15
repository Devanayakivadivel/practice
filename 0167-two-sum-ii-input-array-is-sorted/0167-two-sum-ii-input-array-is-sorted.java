class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                int s=j-i;
                if(numbers[j]+numbers[s]==target){
                    return new int []{s+1,j+1};
                }
            }
            }
            return numbers;
        }
        
    }
