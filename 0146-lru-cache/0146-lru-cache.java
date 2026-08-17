class LRUCache {
    ArrayList<Integer> ls = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        ls.remove(Integer.valueOf(key));
        ls.add(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            ls.remove(Integer.valueOf(key));
            ls.add(key);
            return;
        }
        if (ls.size() == capacity) {
            int lru = ls.get(0);
            ls.remove(0);
            map.remove(lru);
        }
        map.put(key, value);
        ls.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */