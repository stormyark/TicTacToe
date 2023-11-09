package FileTools;

//Historie
// 1.0 Datei schreiben: print2File()
// 2.0 Datei einlesen: readline(), lines(), deletefile()
// 2.01 auch erstes Zeichen in readLine() einlesen
// 2.02 diese Historie und getVersion

import java.io.*; 
public class FileIOTools
{

  public static String getVersion(){
   float version=2.01F;
   String versionMsg=String.valueOf(version)+" :auch erstes Zeichen einlesen";
   return versionMsg;
  }
  

  public static void print2File(String fname, String text)
  {
    try {
      BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw
                                = new BufferedWriter(new FileWriter(fname, true));
                        bw.write(text);
                        bw.newLine();
                        bw.flush();

      bw.close();
    } catch (IOException e) {
      System.err.println(e);
    }
  }
  
  public static String readLine(String fname,int line)
  {
    String text="";
    int c;
    int lineCounter=1;
    try {
      BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader bw
                                = new BufferedReader(new FileReader(fname));
      // System.out.print("skip:");
      while(  ((c=bw.read())!=-1)  && (lineCounter<line) ){
        if(c=='\n')
          lineCounter++;
      //  System.out.print((char) c);
      };// Vorschub
      // System.out.println();

      while(  ((c)!=-1) && (c!='\n')){
        text=text+ (char) c;
        c=bw.read();
       }
      bw.close();
    } catch (IOException e) {
        System.err.println(e);
    }
    return text;
  }
  
  public static int lines(String filename){
   // Zäht die Anzahl der newlines

    int c;
    int lineCounter=1;
    try {
      BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader bw
                                = new BufferedReader(new FileReader(filename));

      while(  (c=bw.read())!=-1)
      {
        while( (c!='\n') && (c!=-1) ){
          System.out.println("skippping:"+(char)c);
          c=bw.read();
        };// skip
        if(  (c=='\n') ){
           lineCounter++;
          System.out.println("newline no:"+lineCounter+" found");
        }

      };
      bw.close();
    } catch (IOException e) {
        System.err.println(e);
    }
    return(lineCounter);
  }
  
  public static void deleteFile(String filename){
    File x=new File(filename);
    // System.out.println("Lösche "+filename);
    x.delete();

  }
  
}
