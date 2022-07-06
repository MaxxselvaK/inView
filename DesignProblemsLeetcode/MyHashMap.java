package DesignProblemsLeetcode;

class MapNode{
    int key;
    int value;
    MapNode next;
    MapNode(int key,int value,MapNode next){
        this.key = key;
        this.next = next;
        this.value = value;
    }
}
public class MyHashMap implements MyCollection
{
    private MapNode[] HashMap ;
    MyHashMap(){
        HashMap = new MapNode[100];
    }
    @Override
    public void add(int key) {

    }
    public int get(int key){
        MapNode n = get(key,HashMap);
        return n == null ? null : n.value;
    }
    public MapNode get(int key,MapNode[] HashMap){
        if(contains(key)){
            int hashCode = getHashCode(key);
            MapNode node = HashMap[hashCode];
            while(node != null){
                if(node.key == key){
                    return node;
                }
            }
        }
        return null;
    }
    public void put(int key,int value){
        if(!contains(key)){
            int hashCode = getHashCode(key);
            HashMap[hashCode] = new MapNode(key,value,HashMap[hashCode]);
        }else {
            MapNode node = get(key,HashMap);
            node.value = value;
        }
    }
    @Override
    public void remove(int key) {
        if(contains(key)){
            MapNode mapNode = HashMap[getHashCode(key)];
            if(mapNode == null){
                return;
            }
            if(mapNode.key == key){
                HashMap[getHashCode(key)] = mapNode.next;
                return;
            }
            while (mapNode.next != null){
                if(mapNode.next.key == key){
                    mapNode.next = mapNode.next.next;
                    return;
                }
                mapNode = mapNode.next;
            }
        }
    }
    @Override
    public boolean contains(int key) {
        int hashCode = getHashCode(key);
        if(HashMap[hashCode] != null){
            MapNode node = HashMap[hashCode];
            while(node != null){
                if(node.key == key){
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public int getHashCode(int key) {
        return key%HashMap.length;
    }
}
