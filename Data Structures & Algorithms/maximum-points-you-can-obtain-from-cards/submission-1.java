class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftSum =0;
        int rightSum = 0;
        int sum = 0;

        for(int i = 0; i < k; i++){
            leftSum = leftSum + cardPoints[i];
        }
        sum = Math.max(sum, (leftSum + rightSum));

        int rIndex = cardPoints.length - 1;

        int leftIndex = k-1;

        while(leftIndex >=0){
            leftSum = leftSum - cardPoints[leftIndex];
            rightSum = rightSum + cardPoints[rIndex];
            leftIndex --;
            rIndex --;
            sum = Math.max(sum, (leftSum + rightSum));
            }

        return sum;
        
    }
}