class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l =0;
        int r= str.length() -1;
        boolean isPalindrome = true;

        while(l <= r){

            if(str.charAt(r)!= str.charAt(l)){
                isPalindrome = false;
                break;
            }
            l++;
            r--;
            }
            return isPalindrome;
        
    }
}
