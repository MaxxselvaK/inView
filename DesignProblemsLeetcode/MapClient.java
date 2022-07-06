package DesignProblemsLeetcode;

public class MapClient {
    public static void main(String[] args) {
        MyHashMap HashMap = new MyHashMap();

        HashMap.put(2,3);
        HashMap.put(2,3);
        HashMap.put(102,3);
        System.out.println(HashMap.contains(2));
        HashMap.remove(2);
        System.out.println(HashMap.contains(2));
        System.out.println(HashMap.contains(102));
    }
}
