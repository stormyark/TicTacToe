import Prog1Tools.*;
public class IOTools_TestStrg {

  public static void main(String[] args) {
        int i=IOTools.readInteger("Ihre Int-Zahl bitte: ");
        System.out.println("Ihre Eingabe lautete : "+i);
        //..IOTools.readXXXX();  jeweils für
        // boolean,byte,char,short,int,long
        // String, Line
        // floar, double
        byte b=IOTools.readByte("Ihre Byte-Zahl bitte: ");
        System.out.println("Ihre Eingabe lautete : "+b);

  }
}

