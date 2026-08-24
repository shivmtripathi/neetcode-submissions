class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int i =0;

        while(i <  fruits.length){
        int j = i;
        Set<Integer> set = new HashSet<>();
            while (j < fruits.length) {

                set.add(fruits[j]);

                if (set.size() > 2) {
                    break;
                }

                max = Math.max(max, j - i + 1);
                j++;
            }
         i++;
          }
          return max;
      }
}