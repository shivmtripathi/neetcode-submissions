class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int idx = 0;
        int [] mArray = new int[m+n];

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                mArray[idx] = nums1[i];
                i++;
                idx++;
            }
            else{
                mArray[idx] = nums2[j];
                j++;
                idx++;
            }
        }
        while(i < m){
                            mArray[idx] = nums1[i];
                i++;
                idx++;
        }
        while(j < n){
                            mArray[idx] = nums2[j];
                j++;
                idx++;
        }
for(int k = 0; k< mArray.length; k++){
    nums1[k] = mArray[k];
}
        
    }
}