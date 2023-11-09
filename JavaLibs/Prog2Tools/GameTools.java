/**
  *
  * Beschreibung
  *  kleien Toolbox zur Programmierung
  *  von Spielen und Animationen
  *  fürProgrammieranfänger
  * @version 1.0 vom 05.04.2013
  * @author
  */
package Prog2Tools;

public class GameTools {

  /**
    * cls(int lines)
    *
    * Leerzeilen auf der Console ausgeben
    */
  public static void cls(int lines) {
    for(int i=0;i<lines;i++){
      System.out.println();
    }

  }

    /**
    * cls()
    *
    * Consolenbildschirm "löschen"
    */

  public static void cls() {
    int lines=25;// 25 Zeilem
     cls(lines);
  }

  /**
    * sleep(int ms)
    *
    * Prozess milisiekunden anhalten
    */

  public static void sleep(int ms){
    try{
      Thread.sleep(ms);
    }catch(Exception e){

    }
  }
  
}

