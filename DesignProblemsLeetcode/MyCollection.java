package DesignProblemsLeetcode;

public interface MyCollection {
    public void add(int key);
    public void remove(int key);
    public boolean contains(int key);
    public int getHashCode(int key);
}
