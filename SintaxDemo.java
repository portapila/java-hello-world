//import java.util.Scanner;

public class SintaxDemo {
   
    public static void main (String[] args){
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0xffffffff;
        
        
        i = (int) l;
        s = (short) i;
        b = (byte) s;

        System.out.println("dummy instruction for debugger");

        

    }    
}
