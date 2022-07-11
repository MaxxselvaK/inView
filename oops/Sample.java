package oops;

public class Sample{
    int i = 1;
    public static void main(String[] args){
        Sample sample = new Sample();
        sample.i = 10;
        sample.change(sample);
        System.out.println(sample.i);
    }
    public void change(Sample sample){
        sample.i= 20;
        sample = new Sample();
        System.out.println(sample.i);
    }
}