package Prog2Tools;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
  *
  * <Beschreibung>
  * Input-Streams in der DOS-Box verarbeiten Benutzereingaben erst
  * nach dem Return.
  * Diese Klasse stellt einen Workaround zur Verfügung,
  * indem parallel eine grafische Benutzeroberfläche gestartet wird,
  * die jeden einzelnen Tastendruck abfängt und zurückgibt.
  * NICHT geeignet für Vollbild-Konsolen!
  * (der Fokus geht in den Hintergrund auf die unsichtbare GUI)
  *
  * @version 1.0 vom 21.06.2010
  * @author   Roland Goldau
  */
public class  InpStream
       extends JFrame
       implements KeyListener
{
  static char c;//Klassenvariable, des letzten eingegeben Zeichens
  static char code;//Klassenvariable, des letzten eingegeben Zeichens (ASCII-Code)
  static boolean isSetC=false;

   
   
  // Anfang Variablen
  static JPanel jpanel = new JPanel(); //JAvaEditor-GUI: Panel
  static JTextField jtfextfield = new JTextField(); //JAvaEditor-GUI: Eingabe-Textfeld
  // Ende Variablen

  private  InpStream (String title) {
    // Frame-Initialisierung
    // super (title);
    addWindowListener(   //JAvaEditor-GUI: Funktion Close-Button der Menüleiste
      new WindowAdapter() {
          public void windowClosing (WindowEvent evt)
          {
                 System.exit(0);}
          }
    );
    setSize(60, 30); // Frame vorbereiten: Größe
    setUndecorated(true);  //Frame vorbereiten: unsichbtar, ohne Menuleiste
    getRootPane().setWindowDecorationStyle(JRootPane.NONE); //Frame vorbereiten: unsichbtar, ohne Menuleiste

    Container cp = getContentPane();//Zeiger auf Frame
    cp.setLayout(new BorderLayout()); // Frame-Layout festlegen

    // Anfang Komponenten
    cp.add(jpanel); // new jPanel (s. Deklaration) auf den Frame legen
    
    jtfextfield.setColumns(5); //new jTextfeld vorbereiten: Breite
    jtfextfield.setBackground(Color.blue); //Textfeld vorbereiten: Hintergrund
    jtfextfield.setText("");
    jpanel.add(jtfextfield);  //vorbereitetes Textfeld auf das panel legen
    // Ende Komponenten


    jtfextfield.addKeyListener(this); // Tastatureingaben (Ereignisse) für das Textfeld überwachen und abfangen
    setVisible(true); // gesamtes Fenster anzeigen
  }

  // Anfang Ereignisprozeduren
  
  /** modifizierte Systemroutine keyTyped(KeyEvent e),
      die das getippte Zeichen von der Tastatur entgegen nimmt.*/
  public  void keyTyped(KeyEvent e) {
        isSetC=true;
        c = e.getKeyChar();
  }

  /** modifizierte Systemroutine keyPressed(KeyEvent e),
      die für die gedrückte Taste den ASCII-Code bestimmt.*/
  public  void keyPressed(KeyEvent e) {
        isSetC=true;
        code = (char) e.getKeyCode();
        c=KeyEvent.getKeyText(code).charAt(0);

    }

  /** modifizierte Systemroutine keyReleased(KeyEvent e),
      die für die losgelassene Taste den ASCII-Code bestimmt. (deaktiviert)*/
    public  void keyReleased(KeyEvent e) {
       // isSetC=true;
       // code = e.getKeyChar();
       // c=KeyEvent.getKeyText(code).charAt(0);
    }

  // Ende Ereignisprozeduren

  /** wartet auf einen Tastendruck und gibt das entsp. druckbare Zeichen zurück */
  public static String getKey(){
    InpStream inpStream=new InpStream("..."); // neues GUi_Fenster öffnen
    char c;//lokal
    while (!inpStream.isSetC){ // auf ein neues Zeichen warten
        try {
           Thread.currentThread().sleep(100); // kleine Pause
        }
        catch (InterruptedException e) {
           System.out.println("ERROR: Thread.sleep"+e);
        }
    }
    c=inpStream.c;  //neues Zeichen aus dem Buffer holen
    inpStream.isSetC=false;  // buffer löschen

    inpStream=inpStream.closeWin(inpStream);  // Fenster wieder schließen
    return Character.toString(c);
  }

  /** wartet max msekunden auf einen Tastendruck 
    * und gibt das entsp. druckbare Zeichen zurück
    * Rückgabewert: length()==0 bei Zeitüberschreitung*/
  public static String getKey(int msec){
    InpStream inpStream=new InpStream("..."); // neues GUi_Fenster öffnen
    int msec_sleep=100;
    int duration=0;
    boolean fin=false;
    String ret;
    
    char c;//lokal
    while (!inpStream.isSetC && ! fin){ // auf ein neues Zeichen warten
        try {
           Thread.currentThread().sleep(msec_sleep); // kleine Pause
           duration=duration+msec_sleep;
           if(duration >= msec){
               fin=true;
           }
        }
        catch (InterruptedException e) {
           System.out.println("ERROR: Thread.sleep"+e);
        }
    }
    if(!fin){
      c=inpStream.c;  //neues Zeichen aus dem Buffer holen
      ret=Character.toString(c);
    }else{
      ret="";
    }
     inpStream.isSetC=false;  // buffer löschen
     inpStream=inpStream.closeWin(inpStream);  // Fenster wieder schließen
     
     return ret;
  }

  /** wartet auf einen Tastendruck und gibt den ASCII-Code zurück.
    * auch für Steuertasten geeignet*/
  public static int getKeyCode(){
    InpStream inpStream=new InpStream("...");
    int code;//lokal

    while (!inpStream.isSetC){
        try {
           Thread.currentThread().sleep(100);
        }
        catch (InterruptedException e) {
           System.out.println("ERROR: Thread.sleep"+e);
        }

    }
    code=inpStream.code;
    inpStream.isSetC=false;


    inpStream=inpStream.closeWin(inpStream);
    return code;
  }

  /** wartet auf einen Tastendruck und gibt den ASCII-Code zurück.
    *  auch für Steuertasten geeignet
    * Rückgabewert: ==0 bei Zeitüberschreitung*/

  public static int getKeyCode(int msec){
    InpStream inpStream=new InpStream("..."); // neues GUi_Fenster öffnen
    int msec_sleep=100;
    int duration=0;
    boolean fin=false;
    int code;//lokal

    while (!inpStream.isSetC && !fin){
        try {
           Thread.currentThread().sleep(msec_sleep);
           duration=duration+msec_sleep;
           if(duration >= msec){
               fin=true;
           }
        }
        catch (InterruptedException e) {
           System.out.println("ERROR: Thread.sleep"+e);
        }

    }
    if(!fin){
     code=inpStream.code;
    }else{
      code=0;
    }
    inpStream.isSetC=false;
    inpStream=inpStream.closeWin(inpStream);

    return code;
  }

  /** interne Hilfsroutine */
  private InpStream closeWin(InpStream inpStream){
    inpStream.setVisible(false);//Fenster ausblenden
    inpStream.dispose(); // Fenster löschen
    return null;
  }


}

