package system.design.DesignDataStructures;

public class MyHashMap <K,V>{
    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAXIMUM_CAPACITY = 1<<30; // Why 1<<30 because integere maximum size is 1<<31 -1 and we need in terms of power if of 2 so 30

    Entry hashTable[];

    MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    MyHashMap(int capacity){
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int size){
        int n = size-1;
        n|= n>>>1;
        n|= n>>>2;
        n|= n>>>4;
        n|= n>>>8;
        n|= n>>>16;
        return (n<0)?1:(n>=MAXIMUM_CAPACITY)?MAXIMUM_CAPACITY:n+1;
    }
    class Entry<K,V>{
        K key;
        V value;
        Entry next;

        Entry(K k, V v){
            key = k;
            value = v;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        Entry newNode = new Entry(key,value);
        if(node==null){
            hashTable[hashCode] = newNode;
        }
        else{
            Entry previousNode = node;
            while(node!=null){
                if(node.key==key){
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            hashTable[hashCode] = newNode;
            previousNode.next = newNode;
        }
    }

    public V get(K key){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];
        while (node!=null){
            if(node.key==key){
                return (V)node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer,String> hm = new MyHashMap();
        hm.put(1,"Ab    hishek");
        hm.put(2, "Barkade");
        hm.put(3, "System");
        hm.put(4,"Design");

        System.out.println(hm.get(1));
        System.out.println(hm.get(5));
    }
}
