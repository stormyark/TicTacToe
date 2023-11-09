import Prog1Tools.*;

public class TicTacToe {
  public static int PlayerY;
  public static int PlayerX;
  public static String PlayerK;
  public static String stein;
  public static String stein2;
  public static String PlayerSel;
  public static int steinzahl = 0;
  public static int oldsteinzahl = 0;
  public static String win = "";
  public static Boolean winquest = false;
  public static String[][] spielfeld = {
      { ".", ".", "." },
      { ".", ".", "." },
      { ".", ".", "." }
  };

  public static void main(String[] args) {
    System.out.println("\n" +
        "████████ ██ ██   ██  ████████  █████  ██   ██  ████████  ██████  ███████ " + "\n" +
        "   ██    ██ ██  ██      ██    ██   ██ ██  ██      ██    ██    ██ ██      " + "\n" +
        "   ██    ██ █████       ██    ███████ █████       ██    ██    ██ █████   " + "\n" +
        "   ██    ██ ██  ██      ██    ██   ██ ██  ██      ██    ██    ██ ██      " + "\n" +
        "   ██    ██ ██   ██     ██    ██   ██ ██   ██     ██     ██████  ███████ " + "\n");

    PlayerSel = IOTools.readString("1: O" + "\n" + "2: X " + "\n" + "Bitte waehle dein Zeichen: ");
    if (PlayerSel.equals("1")) {
      stein = "O";
      stein2 = "X";
    } else {
      stein = "X";
      stein2 = "O";
    }
    System.out.println("============================");
    System.out.println("Spieler 1: " + stein + "\n" + "Spieler 2: " + stein2 + "\n" + "============================");
    System.out.println("So sieht das Spielfeld aus:");

    String[][] spielfeldshow = {
        { "7", "8", "9" },
        { "4", "5", "6" },
        { "1", "2", "3" }
    };

    for (int y = 0; y < spielfeldshow.length; y++) {
      for (int x = 0; x < spielfeldshow[y].length; x++) {
        System.out.print(spielfeldshow[y][x]);
      }
      System.out.print("\n");
    }

    System.out.println("============================");

    do {
      if (stein.equals("X")) {
        System.out.println("| X ist dran");
      } else if (stein.equals("O")) {
        System.out.println("| O ist dran");
      }

      PlayerK = IOTools.readString("Bitte geben Sie eine Zahl zwischen 1 und 9 ein: ");

      // Matrix
      oldsteinzahl = steinzahl;
      if (PlayerK.equals("7") && spielfeld[0][0].equals(".")) {
        spielfeld[0][0] = stein;
        steinzahl++;
      } else if (PlayerK.equals("8") && spielfeld[0][1].equals(".")) {
        spielfeld[0][1] = stein;
        steinzahl++;
      } else if (PlayerK.equals("9") && spielfeld[0][2].equals(".")) {
        spielfeld[0][2] = stein;
        steinzahl++;
      } else if (PlayerK.equals("4") && spielfeld[1][0].equals(".")) {
        spielfeld[1][0] = stein;
        steinzahl++;
      } else if (PlayerK.equals("5") && spielfeld[1][1].equals(".")) {
        spielfeld[1][1] = stein;
        steinzahl++;
      } else if (PlayerK.equals("6") && spielfeld[1][2].equals(".")) {
        spielfeld[1][2] = stein;
        steinzahl++;
      } else if (PlayerK.equals("1") && spielfeld[2][0].equals(".")) {
        spielfeld[2][0] = stein;
        steinzahl++;
      } else if (PlayerK.equals("2") && spielfeld[2][1].equals(".")) {
        spielfeld[2][1] = stein;
        steinzahl++;
      } else if (PlayerK.equals("3") && spielfeld[2][2].equals(".")) {
        spielfeld[2][2] = stein;
        steinzahl++;
      } else {
        System.out.println("Bitte waehle eine andere Position.");
      }

      if (stein.equals("X") && oldsteinzahl == steinzahl - 1) {
        stein = "O";

      } else if (stein.equals("O") && oldsteinzahl == steinzahl - 1) {
        stein = "X";

      } else {
        System.out.println("Du bist nochmal dran!");
      }

      // Spielfeld printen
      for (String[] strings : spielfeld) {
        for (int x = 0; x < strings.length; x++) {
          System.out.print(strings[x]);
        }
        System.out.print("\n");
      }

      // wincases
      for (int i = 0; i < 9; i++) {
        win = spielfeld[0][0] + spielfeld[1][0] + spielfeld[2][0];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[0][1] + spielfeld[1][1] + spielfeld[2][1];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[0][2] + spielfeld[1][2] + spielfeld[2][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[0][0] + spielfeld[0][1] + spielfeld[0][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[1][0] + spielfeld[1][1] + spielfeld[1][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[2][0] + spielfeld[2][1] + spielfeld[2][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[0][0] + spielfeld[1][1] + spielfeld[2][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }
        win = spielfeld[2][0] + spielfeld[1][1] + spielfeld[0][2];
        if (win.equals("XXX")) {
          System.out.println("============================");
          System.out.println("X hat gewonnen!");
          winquest = true;
          break;
        } else if (win.equals("OOO")) {
          System.out.println("============================");
          System.out.println("O hat gewonnen");
          winquest = true;
          break;
        }

        if (steinzahl == 9 && !winquest) {
          System.out.println("============================");
          System.out.println("Gleichstand!");
          winquest = true;
          break;
        }
      }

      if (winquest) {
        System.out.println("============================");
        System.out.println("Danke fürs Spielen :)");
        break;
      }
    } while (steinzahl <= 10);
  }
}