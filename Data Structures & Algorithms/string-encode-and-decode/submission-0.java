class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){

            str.append(s.length());
            str.append("#");
            str.append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {

        int i = 0;
        List<String> strs = new ArrayList<>();
        while (i < str.length()){
             int j = i;
            while (str.charAt(j) != '#'){ j++;}
            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            strs.add(str.substring(start, start + length));
            i = start + length;
         }
             return strs;
     }
}
