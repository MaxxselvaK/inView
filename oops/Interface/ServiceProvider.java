package oops.Interface;

abstract class ServiceProvider implements ServiceRequirement {
    public int saveToDb(int data){
        return 1;
    }
}
