class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        List<List<String>> rStr = new ArrayList<>();

        for(int i =0; i< strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
            if(map.containsKey(sortStr)){
                map.get(sortStr).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortStr, list);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            rStr.add(entry.getValue());
        }
        return rStr;
        
    }
}
