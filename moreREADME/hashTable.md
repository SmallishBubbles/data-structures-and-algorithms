# Hashtables
<!-- Short summary or background information -->

## Challenge
Implement a Hashtable with the following methods:

1. `add`: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling `collisions` as needed.
2. `get`: takes in the key and returns the value from the table.
3. `contains`: takes in the key and returns a boolean, indicating if the key exists in the table already.
4. `hash`: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
My implementation doubles the hash table size on `collision` and re-indexes hash table items. This approach ensures `O(1)` lookup time (`get` and `contains` methods), but can cause `O(n)` time on `add`.

## API
1. __`add` (public):__ takes in both the key and value, and adds the item to the hash table. If the key already exists, the value will be updated. This method has a runtime of O(n) in the worst case (collision), and O(1) in the best case (no collision).
2. __`get` (public):__ takes in the key and returns the value from the table. This method has a runtime of O(1). This method will throw a `no such element exception` if the key does not exist in the table. This method has a runtime of O(1).
3. __`contains` (public):__ takes in the key and returns a boolean, indicating if the key exists in the table already. This method has a runtime of O(1).
4. __`hash` (private, helper function):__ takes in an arbitrary key and returns an index in the collection. This method has a runtime of O(1).