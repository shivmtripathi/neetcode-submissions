class MyHashSet {

    private List<Integer>[] buckets;
    private static final int SIZE = 10;

    public MyHashSet() {
        this.buckets = new List[1000];
        for (int i = 0; i < SIZE; i++) {
        buckets[i] = new ArrayList<>();
    }
        
    }
    
    public void add(int key) {

        int bucket = key % SIZE;
        List<Integer> list = buckets[bucket];
        if(!list.contains(key)){
            list.add(key);
        }        
    }
    
    public void remove(int key) {
        int bucket = key % SIZE;
        List<Integer> list = buckets[bucket];
        if(list.contains(key)){
         list.remove(Integer.valueOf(key));

    }

        
    }
    
    public boolean contains(int key) {
                int bucket = key % SIZE;
        List<Integer> list = buckets[bucket];
               return list.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */