/**
  *
  * Beschreibung
  *  Einfache Routinen zur Erstellung einfacher Spiele und Animationen
  *
  * @version 1.0 vom 05.04.2013
  * @author
  */
import Prog2Tools.*;

public class GameTools_TestStrg {

  public static void main(String[] args) {
     String symbol="IHI";
     int pausems=1000;//mms
     float speedUp=1.1F;//Beschleunigung, d.h Verkürzungsdivisor der Pausenzeit
     int ypos;
     // Beschleunigung
     
     for(ypos=0; ypos<80;ypos++){//80 Spalten
       GameTools.cls();
       // führende Leerzeichen
       for(int ly=0;ly < ypos;ly++){
         System.out.print(" ");
       }
       System.out.println(symbol);
       GameTools.sleep(pausems);
       pausems=(int) (pausems/ speedUp);// immer schneller
     }
   }
}

