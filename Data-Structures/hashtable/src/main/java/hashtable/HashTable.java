package hashtable;

import java.util.NoSuchElementException;

public class HashTable<K, V> {

    /*
    -[] Implement a Hashtable with the following methods:
        -[x] add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
        -[x] get: takes in the key and returns the value from the table.
        -[x] contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
        -[x] hash: takes in an arbitrary key and returns an index in the collection.
    */


    Node<K, V>[] map;

    public HashTable(int size) {
        map = new Node[size];
    }

    private int hash(K key) {
        int hashValue = 0;
        String stringyKey = key + "";
        char[] letters = stringyKey.toCharArray();
        for( int i = 0; i<letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    public void add(K key, V value) {
        int keyHash = this.hash(key);
        if ( this.map[keyHash] == null ) {
            this.map[keyHash] = new Node<>(key, value);
        } else if ( this.map[keyHash].getKey().equals(key) ) {
            // this key already exists. Update the value.
            this.map[keyHash].setValue(value);
        } else {
            // copy old values
            Node<K, V>[] temp = this.map;
            this.map = new Node[this.map.length * 2];
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != null) {
                    this.add(temp[i].getKey(), temp[i].getValue());
                }
            }
            // add new value
            this.add(key, value);
        }
    }

    public V get(K key) {
        int keyHash = this.hash(key);
        if ( this.map[keyHash] != null && this.map[keyHash].getKey().equals(key)) {
            return this.map[keyHash].getValue();
        } else {
            throw new NoSuchElementException("That key is not in the hash table");
        }
    }

    public boolean contains(K key) {
        int keyHash = this.hash(key);
        if ( this.map[keyHash] != null && this.map[keyHash].getKey().equals(key)) {
            return true;
        } else {
            return false;
        }
    }



}
