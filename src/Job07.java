import javax.swing.*;
import java.util.Scanner;

public class Job07 {
    public static void transformation() {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        affichageMenu();

        int choice = scanner.nextInt();
        String phrase;

        while (run) {
            switch (choice) {
                case 1:
                    System.out.println("gras");
                    System.out.println("Write your first phrase");
                    phrase = scanner.nextLine();
                    gras(phrase);
                    System.out.println(phrase);
                    break;
                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                case 2:
                    System.out.println("cesar");
                    System.out.println("Write your first phrase");
                    phrase = scanner.nextLine();
                    cesar(phrase);
                    System.out.println(phrase);
                    break;
                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                case 3:
                    System.out.println("plateforme");
                    System.out.println("Write your first phrase");
                    phrase = scanner.nextLine();
                    plateforme(phrase);
                    System.out.println(phrase);
                    break;
                default:
                    System.out.println("Choix non valide");
                    affichageMenu();
                    choice = scanner.nextInt();
                    break;

                case 4 :
                    System.out.println("Exit");
                    run = false;
                    break;
            }
        }
    }

    public static void affichageMenu() {
            System.out.println("What choice do you want to do?");
            System.out.println("Choice 1: gras");
            System.out.println("Choice 2: cesar");
            System.out.println("Choice 3: plateforme");
            System.out.println("Choice 4: Exit");
    }

    public static String text (String str) {
        String [] array1 = str.split( " ") ;// phrase ecrit par utilisateur
        String rslt = ""  ;
//toUpperCase
        char[] strEnTableaux = str.toCharArray();
        for (char c : strEnTableaux) {
            if()
        }
//Correction pour "plateforme"

        public static String plateforme (String str) {
            String [] array = str.split( " ");
           String result = "";
            for(String s : array) {
                if (s.lenght()==1){
                    result += string + " ";
                continue;
                }
               if (s.charAt(s.length()-1) == "e" && s.chartAt(s.length()-2) == "m") {
                   result += s + '_';
               } else {
                   result += s;
               }    result += " ";
            }   return result;
        }

    }




    public static void main (String[]args){
        // "Toulon a la Carte" -> "*Toulon* a la *Carte*"
        transformation();
        System.out.println(plateforme(""));
    }

}
