class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        int[] arr = new int[k];
        for(int j = 0; j < k; j++){
            arr[j] = list.get(j).getKey();
        }
        return arr;
        
    }
}
