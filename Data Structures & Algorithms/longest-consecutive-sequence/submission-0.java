class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int l =0;
        for(int i =0; i< nums.length; i++){
            set.add(nums[i]);
        }
        for(int j =0; j< nums.length; j++){
           int current = nums[j];
           int length = 1;
           if(!set.contains(current -1)){
            while(set.contains(current+1)){
                current ++;
                length++;
            }
            max = Math.max(max, length);
           }
         }
        return max;
        
    }
}
