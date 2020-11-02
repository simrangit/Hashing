# Hashing

This discusses about the 3 main concepts in Java:

1. HashTable.
2. HashMap.
3. HashSet.


1. Hash Table:
This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value. To successfully store and retrieve   objects  from a hashtable, the objects used as keys must implement the hashCode method and the equals method.

A.	Similar to HashMap but is synchronised.
B.	HT stores key/value pair in hash table.
C.	In HT, we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
D.	Contains only unique values.
E.	Does not contain null keys or values.

	Basic methods of HT:
•	put(Object key, Object value) – Used to put/insert a particular mapping of key-value pair into a map.
•	Get(Object Key) – It is used to retrieve or fetch the value mapped by a particular key.
•	containsKey(Object Key) – Used to return True if for a specified key, mapping is present in the map.
•	containsValue(Object Value) – Used to return true if one or more key is mapped to a specified value.
•	entrySet() – It is used to return a set view of the hash map.
•	Size() – It is used to return the size of a map.

Note: I referred geeksforgeeks website - https://www.geeksforgeeks.org/hashtable-in-java/

2. Hash Map:
A hash map is a part of Java’s collection. It provides the basic implementation of the Map interface in Java. Stores the data in the form of (Key, Value) pairs. To access a value, one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. Hashing is a technique of converting a large String to small String that represents the same String.

A.	Stores data in the form of (key, value) pairs. 
B.	Part of java.util package.
C.	Does not allows duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value, but more than 1 key can contain a single value.
D.	HM allows null key also but only once and multiple null values.
E.	Basic methods: (containsKey(Object Key), containsValue(Object Value), put(Object key, Object value), get(Object Key), entrySet())

Basic Methods of HashMap:

•	put(Object key, Object value) – Used to put/insert a particular mapping of key-value pair into a map.
•	Get(Object Key) – It is used to retrieve or fetch the value mapped by a particular key.
•	containsKey(Object Key) – Used to return True if for a specified key, mapping is present in the map.
•	containsValue(Object Value) – Used to return true if one or more key is mapped to a specified value.
•	entrySet() – It is used to return a set view of the hash map.
•	Size() – It is used to return the size of a map.

