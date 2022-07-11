package oops.Inheritance;

public class MultiPleInheritanceWithMultipleDefaultMethods implements InFace1,inFace2{ // ,inFace2{ // we will get compile time error if both same interface has same signature methods

    @Override
    public void m1() {
        InFace1.super.m1(); //solved using this
    }
}
