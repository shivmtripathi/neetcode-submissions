class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];

        int i = 0;
        int j = nums.length-1;
        int idx = j;
         while(i <= j){
            int squareLeft = nums[i] * nums[i];
            int sqaureRight = nums[j] * nums[j];

            if(squareLeft > sqaureRight){
                arr[idx] = squareLeft;
                i++;
                idx--;
            }
            else{
                arr[idx] = sqaureRight;
                j--;
                idx--;
            }

         }
         return arr;




        
    }
}