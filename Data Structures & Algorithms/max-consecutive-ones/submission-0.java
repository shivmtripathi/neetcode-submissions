class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max =0;
        int l =0;
        int r = 0;

        while(r < nums.length){
            int length = 0;

            if(nums[r] == 0){
                l = r+1;
                r++;
            }

            else if(nums[l] == 0){
                l++;
            }

            else{
                length = r - l +1;
                r++;
            }

            max = Math.max(max, length);

              



        }
        return max;
        
    }
}