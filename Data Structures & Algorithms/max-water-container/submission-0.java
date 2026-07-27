class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max = 0;
        while(i < j){
            int result = 0;
            if (heights[i]< heights[j]){
                result = heights[i] * (j - i);
                if(result > max){
                    max = result;
                }
                i++;

            }
            else{
                              result = heights[j] * (j - i);

                              if(result > max){
                    max = result;
                }
              j--;
            }
        }
        return max;
        
    }
}
