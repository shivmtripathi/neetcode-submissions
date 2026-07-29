class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        int max = 0;;
        int maxFreq = 0; 
        int l =0;
        int r = 0;


        while (r < s.length()){

            freqMap.put(s.charAt(r), freqMap.getOrDefault(s.charAt(r), 0) + 1);
            int freq = freqMap.get(s.charAt(r));
            maxFreq = Math.max(maxFreq, freq);

            if((r-l + 1) - maxFreq > k){
                freqMap.put(s.charAt(l), freqMap.get(s.charAt(l)) - 1);
                l++;
                 }
            else{
                max = Math.max(max, r-l+1);
            }
            r++;
        }
        return max;
        
    }
}
