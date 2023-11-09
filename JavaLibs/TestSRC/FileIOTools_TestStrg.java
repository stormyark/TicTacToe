import Prog2Tools.*;
public class FileIOTools_TestStrg {

  public static void main(String[] args) {
    String fname="H:\\Test.txt";
    String msg="Hallo";
    String str2;
    
    FileIOTools.print2File(fname,msg);
    FileIOTools.print2File(fname,msg+" "+msg);

    int l=FileIOTools.lines(fname);
    System.out.println("Die Datei "+fname +"beinhaltet "+l+" Zeilen");
    for(int i=0;i<l;i++){
       str2=FileIOTools.readLine(fname,i+1);
       System.out.println(str2);
    }

    System.out.println("Datei "+fname+" wird wieder gelöscht");
    FileIOTools.deleteFile(fname);


    
    
  }
}

