class Solution {
    public String longestCommonPrefix(String[] strs) {

        int i =0;

        int minLenth = Integer.MAX_VALUE;
        while(i< strs.length){
            minLenth = Math.min(minLenth, strs[i].length());
            i++;
        }
        for(int j = 0; j< minLenth; j++){

 
        for(String s : strs){


                if(s.charAt(j) != strs[0].charAt(j)){
                    return strs[0].substring(0, j);
                }
            
              
            }

        }
return strs[0].substring(0, minLenth); 

        
    }
}