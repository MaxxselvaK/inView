package DesignProblemsLeetcode;
class Node{
    final int val;
    Node next;
    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}

// links to revisit https://leetcode.com/problems/design-hashset/discuss/1414396/Java-rehashing-with-static-load-factor-100-speed
// problem link https://leetcode.com/problems/design-hashset/
public class MyHashSet {
    private double loadFactor;
    private Node[] hash;
    private  int _load = 0;

    MyHashSet(){
        loadFactor = 0.75;
        hash = createHash(16);
    }
    public void add(int key){
//        int hashCode = getHashCode(key);
//        if(!contains(key,hash)){
//            ++_load;
//            hash[hashCode] = new Node(key,hash[hashCode]);
////            return;
//        }
////        hash[hashCode] = new Node(key,null);
        add(key,hash);
    }
    private void add(int key,Node[] hash){
        int hashCode = getHashCode(key);
        if(!contains(key,hash)){
            ++_load;
            hash[hashCode] = new Node(key,hash[hashCode]);
        }
    }
    public void remove(int key){
        int hashCode = getHashCode(key);
        Node node = hash[hashCode];
        if(node == null){
            return;
        }
        if(node.val == key){
            hash[hashCode] = node.next;
        }
            while(node.next != null){
                if(node.next.val == key){
                    node.next = node.next.next;
                    --_load;
                    return;
                }
                node = node.next;
            }
    }
    boolean contains(int key){
        return contains(key,hash);
    }
    boolean contains(int key,Node[] hash){
        Node node = hash[getHashCode(key)];
        if(node == null){
            return false;
        }
        while(node!=null){
            if(node.val == key){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public int getHashCode(int key){
        return key%hash.length;
    }
    Node[] createHash(int size){
//        Node[] h = new Node[size];
//        // we can eliminate the for loop too
//        for(int i=0;i<h.length;i++){
//            h = null;
//        }
        return new Node[size];
    }
//    private void rehash(){
//        int newSize = hash.length*2;
//        Node[] h = new Node[newSize];
//        for(int hashKey=0;hashKey<hash.length;hashKey++){
//            for(Node node = hash[hashKey]; node != null; node = node.next){
//                add(node.val,h);
//            }
//        }
//        hash = h;
//    }
}
