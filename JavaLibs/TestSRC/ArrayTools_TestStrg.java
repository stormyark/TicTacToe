/**
  *
  * Beschreibung
  *  Test- und demoprogramm für ArrayTools
  *
  * @version 1.0 vom 26.02.2013
  * @author
  */
import Prog2Tools.*;
public class ArrayTools_TestStrg {

  /**
    * Test und Funktionsweise der Tools
    *
    */
  public static void main(String[] args)
  {


    float test[];
    test=new float[33];
    ArrayTools.initArrayHelp();



    // initArray(test,3.3D);
    ArrayTools.initRandomArray(test, 0.5f, 1.5f);

    for(int i=0;i<test.length;i++)
      System.out.print(test[i]+" ");

    int x[]=ArrayTools.newArray(10,0);

    ArrayTools.printArray(x);

    int y[][]=ArrayTools.newArray(10,3,11);

    for(int i=0;i<y.length;i++)
            ArrayTools.printArray(y[i]);

   char cc[]=ArrayTools.newArray(10,' ');
   ArrayTools.initRandomArray(cc,'A',(char) ('Z'-'A'));
   ArrayTools.printArray(cc);

   //aufsteigend sortiert
   int fs[]=ArrayTools.newArray(10,0);
   ArrayTools.initSortedRandomArray(fs,0, 10);
   ArrayTools.printArray(fs);


   //abfsteigend sortiert
   int fs2[]=ArrayTools.newArray(100,0);
   ArrayTools.initSortedRandomArrayDesc(fs2,0, 10);
   ArrayTools.printArray(fs2);

  }
}

