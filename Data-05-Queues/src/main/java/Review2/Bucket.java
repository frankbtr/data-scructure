package Review2;

import java.util.LinkedList;

public class Bucket {
    LinkedList<KeyValue<Integer,Integer>> bucket;

    public Bucket() {
        this.bucket=new LinkedList<KeyValue<Integer, Integer>>();
    }
    public int get(int key){
        for (KeyValue<Integer,Integer> pair:bucket) {
            if (pair.key.equals(key)) return pair.value;
        }
        return -1;
    }
    public void remove(int key){
        for (KeyValue<Integer,Integer> pair:bucket) {
            if (pair.key.equals(key)) {
                this.bucket.remove(pair);
                break;
            }
        }
    }
    public void update(int key, int value){
        //if key exists update the value
        boolean found=false;
        for (KeyValue<Integer,Integer> pair:bucket) {
            if (pair.key.equals(key)) {
                pair.value=value;
                found=true;
            }
        }
        // no existing key value
        if(!found) this .bucket.add(new KeyValue<>(key, value));

    }
}