package oops.Interface;
import java.util.function.*;
public class SupplierInf{
    public static void main(String[] args){
        Supplier<String> greetingsSupplier = () -> "Happy Birthday";

        System.out.println(greetingsSupplier.get());

        // OTP generator supplier

        Supplier<String> otp = () -> {
            String toRet = "";
            int t = 6;
            while(t!=0){
                toRet = toRet+ (int) (Math.random()*10); // generated 0 to 9
                t--;
            }
            return toRet;
        };
        System.out.println("New OTP : "+otp.get());
    }
}