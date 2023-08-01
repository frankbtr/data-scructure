package Review2;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    public List<Bucket> hashMap;
    public int modNumber;

    public MyHashMap() {
        this.modNumber = 2341;
        this.hashMap=new ArrayList<>();
        for (int i = 0; i < 2341; i++) {
            this.hashMap.add(new Bucket());
        }
    }

    public void put(int key, int value) {
        // calculate the index address with modulus operation
        int hashCode = key % modNumber;
        this.hashMap.get(hashCode).update(key, value);
    }

    public int get(int key) {
        // calculate the index address with modulus operation
        int hashCode = key % modNumber;
        return this.hashMap.get(hashCode).get(key);

    }

    public void remove(int key) {
        // calculate the index address with modulus operation
        int hashCode = key % modNumber;
        this.hashMap.get(hashCode).remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */