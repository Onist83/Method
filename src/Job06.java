public class Job06 {

    public static String leetSpeak(String str) {
        String resultat = "";
        String[] lettres = {"A", "B", "E", "G", "L", "S", "T"};

       /* int[] array = new int[7];
        array[0] = 4;
        array[1] = 8;
        array[2] = 3;
        array[3] = 6;
        array[4] = 1;
        array[5] = 5;
        array[6] = 7;*/

        char[] strEnTableaux = str.toCharArray();

        for (char c : strEnTableaux) {
            if (c == 'A') {
                resultat = resultat + "4";
            } else if (c == 'B') {
                resultat = resultat + "8";
            } else if (c == 'E') {
                resultat = resultat + "3";
            } else if (c == 'G') {
                resultat = resultat + '6';
            } else if (c == 'L') {
                resultat = resultat + '1';
            } else if (c == 'S') {
                resultat = resultat + '5';
            } else if (c == 'T') {
                resultat = resultat + '7';
            } else {
                resultat = resultat + c;
            }

        }return resultat;
    }




        public static void main (String[]args){

            System.out.println(leetSpeak("LEET SPEAK"));
        }
    }



