class Solution {
    public int[] getConcatenation(int[] nums) {

        int [] ans = new int[2 * nums.length];
        int i = 0;
        int j =0;

        while(j < ans.length){
            ans[j] = nums[i];
            j++;
            i++;
            if(i == nums.length){
                i =0;
            }
        }
        while(j < nums.length){
            ans[j+ nums.length] = nums[j];
            j++;
        }
        return ans;


        
    }
}