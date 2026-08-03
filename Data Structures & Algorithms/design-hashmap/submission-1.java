class MyHashMap {

            private static class Entry{
            private int key;
            private int value;

        Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
        }
        


        LinkedList<Entry> [] buckets;
        private static final int SIZE = 1000;

    public MyHashMap() {


            this.buckets = new LinkedList[1000];
            for(int i =0; i< SIZE; i++){
                buckets[i] = new LinkedList<Entry>();
            }
        
    }
    
    public void put(int key, int value) {

        int bucket = key % SIZE;
        Entry entry = new Entry(key, value);
        LinkedList<Entry> list = buckets[bucket];

        for(Entry e : list){
            if(e.key == key){
                e.value = value;
                return;
            }
        }
        list.add(entry);
    }
    
    public int get(int key) { 
        int bucket = key % SIZE;
        List<Entry> list = buckets[bucket];
        for(Entry e : list){
            if(e.key == key)
            return e.value;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int bucket = key % SIZE;
        List<Entry> list = buckets[bucket];
            for(int i = 0; i< list.size(); i++){
                Entry e = list.get(i);
            if(e.key == key){
            list.remove(i);
            return;

            }
        }

        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */