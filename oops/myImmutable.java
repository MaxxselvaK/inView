package oops;

public final class myImmutable { // final class so that we can't extend
    final Integer a; // final value so that it can't be assigned more than once / modified
    myImmutable(Integer a){
        this.a = a.intValue(); // deep copy
    }
    @Override
    public String toString(){
        return this.a+"";
    }
}
