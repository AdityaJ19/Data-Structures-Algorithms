package HashMaps;

//Hashmap is an array of entries which acts like a LinkedList

import java.util.Map;

public class OwnHashMap<K, V> {

    private class Entry<K, V>{
        public K key;
        public V value;
        //next is for put
        private Entry<K, V> next;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        private final int SIZE = 5;
        private Entry<K, V> table[];

        public void OwnHashMap(){
            table = new Entry[SIZE];
        }
        //now put function will be implemented because at first tha
        // hashmap will be empty so we need to add new values into the table

        public <k> void put(k key, V value){
            //so hashcode number will be big for it to
            // store in an array hence we use modulo function
            int hash = key.hashCode() % SIZE;
            Entry<K, V> e = table[hash];

            if (e == null){
                table[hash] = new Entry<K, V>((K) key, value);
            }
        }
    }
}
