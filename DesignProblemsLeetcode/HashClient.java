package DesignProblemsLeetcode;

public class HashClient {
    public static void main(String[] args) {

        MyHashSet hashSet = new MyHashSet();
        hashSet.add(10);
        hashSet.add(12);
        hashSet.add(10);
        hashSet.add(13);
        System.out.println(hashSet.contains(12));
        hashSet.remove(12);
        System.out.println(hashSet.contains(12));

    }
}
