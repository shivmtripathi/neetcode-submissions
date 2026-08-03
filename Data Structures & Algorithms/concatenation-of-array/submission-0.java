class Solution {
    public int[] getConcatenation(int[] nums) {

        int [] ans = new int[2 * nums.length];
        int i = 0;

        while(i< nums.length){
            ans[i] = nums[i];
            i++;
        }
        int j =0;
        while(j < nums.length){
            ans[j+ nums.length] = nums[j];
            j++;
        }
        return ans;


        
    }
}