package Prog2Tools;
/**
  * Toolbox für Programmieranfäger mit
  * einfachen Methoden zum Handling mit Arrays
  * für alle Standarddatentypen
  *
  * @version 2.0 vom 04.04.2013 fehlende Datentypen ergänzt
  * @version 1.0 vom 10.06.2012
  * @author Roland Goldau
  */
import java.math.*;// für Random

public class ArrayTools{

  /**
    * Gebrauchsanweisung dieser Toolbox
    *
    */
  public static void initArrayHelp()
  {

    System.out.println("  //*** initArray( Array[], Wert) *****");
    System.out.println("  //*** initRandomArray(Array, min, range) **** Zufallswerte zuweisen");;
    System.out.println("\n");
  }
  
  //  eindimensionale Arrays

  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static int[] newArray(int dim1,int initVal){
     int[] i=new int[dim1];
     initArray(i,initVal);
     return i;
     
  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static char[] newArray(int dim1,char initVal){
     char[] i=new char[dim1];
     initArray(i,initVal);
     return i;

  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static short[] newArray(int dim1,short initVal){
     short[] i=new short[dim1];
     initArray(i,initVal);
     return i;

  }
  
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */  public static byte[] newArray(int dim1,byte initVal){
     byte[] i=new byte[dim1];
     initArray(i,initVal);
     return i;

  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static boolean[] newArray(int dim1,boolean initVal){
     boolean[] i=new boolean[dim1];
     initArray(i,initVal);
     return i;

  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static long[] newArray(int dim1,long initVal){
     long[] i=new long[dim1];
     initArray(i,initVal);
     return i;

  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static long[] newArray(long dim1,long initVal){
     long[] i=new long[(int) dim1];
     initArray(i,initVal);
     return i;

  }

  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static float[] newArray(int dim1,float initVal){
     float[] i=new float[dim1];
     initArray(i,initVal);
     return i;

  }
  /**
    * eindimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static double[] newArray(int dim1,double initVal){
     double[] i=new double[dim1];
     initArray(i,initVal);
     return i;

  }
  
  //zweidimensionale Arrays

  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static int[][] newArray(int dim1,int dim2, int initVal){
     int[][] f=new int[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new int[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static short[][] newArray(int dim1,int dim2, short initVal){
     short[][] f=new short[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new short[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static long[][] newArray(int dim1,int dim2, long initVal){
     long[][] f=new long[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new long[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static byte[][] newArray(int dim1,int dim2, byte initVal){
     byte[][] f=new byte[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new byte[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static boolean[][] newArray(int dim1,int dim2, boolean initVal){
     boolean[][] f=new boolean[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new boolean[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static float[][] newArray(int dim1,int dim2, float initVal){
     float[][] f=new float[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new float[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  
  /**
    * zweidimensionales Array
    * mit Default-Wert im entspr.Datentyp anlegen
     */
  public static double[][] newArray(int dim1,int dim2, double initVal){
     double[][] f=new double[dim1][dim2];
     for(int i=0;i<f.length;i++){
       f[i]=new double[dim2];
       initArray(f[i],initVal);
     }
     return f;
  }
  
  
  
  
  //*** initArray( Array[], Wert) *****
    /**
    * eindimensionales Array
    * mit Wert initialisieren
     */
  public static long[] initArray(long f[],long def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static int[] initArray(int f[],int def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static char[] initArray(char f[],char def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static boolean[] initArray(boolean f[],boolean def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static byte[] initArray(byte f[],byte def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static short[] initArray(short f[],short def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static float[] initArray(float f[],float def)
  {
   for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }
  /**
    * eindimensionales Array
    * mit Wert initialisieren
    */
  public static double[] initArray(double f[],double def)
  {
    for(int i=0;i<f.length;i++)
      f[i]=def;
    return f;
  }

  //*** initRandomArray(Array, min, range) **** Zufallswerte zuweisen
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static byte[] initRandomArray(byte f[],byte min, byte range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(byte) (min+Math.random()*range);
    return f;
  }
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static short[] initRandomArray(short f[],short min, short range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(short) (min+Math.random()*range);
    return f;
      
  }
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static int[] initRandomArray(int f[],int min, int range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(int) (min+Math.random()*range);
    return f;
  }
  //*** initRandomArray(Array, min, range) **** Zufallswerte zuweisen
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static char[] initRandomArray(char f[],char min, char range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(char) (min+Math.random()*range);
    return f;
  }
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static long[] initRandomArray(long f[],long min, long range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(long) (min+Math.random()*range);
    return f;
  }
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static float[] initRandomArray(float f[],float min, float range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(float) (min+Math.random()*range);
      return f;
  }
  /**
    * eindimensionales Array
    * mit Zufallswerten im angegebenen  Wertebereich initialisieren
    */
  public static double[] initRandomArray(double f[],double min, double range)
  {
    for(int i=0;i<f.length;i++)
      f[i]=(double) (min+Math.random()*range);
    return f ;
  }
  
  //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static int [] initSortedRandomArray(int f[],int min, int range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(int) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }

  //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static byte[] initSortedRandomArray(byte f[],byte min, byte range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(byte) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
    //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static char[] initSortedRandomArray(char f[],char min, char range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(char) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
     //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static long[] initSortedRandomArray(long f[],long min, long range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(long) (min+Math.random()*range);
      min=f[i];
    }
    return  f;
  }
  
     //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static float[] initSortedRandomArray(float f[],float min, float range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(float) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
     //aufsteigend sortiertes, mit Zufallswerten belegtes feld inititialiserenFeld
  /**
    * Feld mit aufsteigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static double[] initSortedRandomArray(double f[],double min, double range)
  {
    for(int i=0;i<f.length;i++){
      f[i]=(double) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
  /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static int[] initSortedRandomArrayDesc(int f[],int min, int range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(int) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }

    /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static byte[] initSortedRandomArrayDesc(byte f[],byte min, byte range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(byte) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
    /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static short[] initSortedRandomArrayDesc(short f[],short min, short range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(short) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
    /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static long[] initSortedRandomArrayDesc(long f[],long min, long range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(long) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
    /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static float[] initSortedRandomArrayDesc(float f[],float min, float range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(float) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }
  
    /**
    * Feld mit ab-steigenden Zufallswerten jeweils im Bereich von range
    * belegen z.B. [0]=(0..10); [1]=(11-20); usw
    */
  public static double[] initSortedRandomArrayDesc(double f[],double min, double range)
  {
    for(int i=f.length-1;i>-1;i--){
      f[i]=(double) (min+Math.random()*range);
      min=f[i];
    }
    return f;

  }

  // AUSDRUCKEN DER FELDELEMENTE
  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(byte f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }
  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(short f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }
  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(int f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }
  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(char f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }


  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(long f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }
  
  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(float f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }

  /**
    * eindimensionales Array
    * am Bildschirm ausgeben
    */
  public static void printArray(double f[])
  {
    for(int i=0;i<f.length;i++)
      System.out.print(f[i]+" ; ");
    System.out.println("\n");
  }

}
