public class Job05 {

    public static int occurences(String str, char caractere) {
//        String str = "Il fait beau aujourd'hui!";
        char[] array = str.toCharArray();
        int i = 0;

        for (char caracter : array) {
            if (caracter == caractere){
                i++;
            }

        }
        return i;
    }

        public static void main (String[]args){
            //String str = "Il fait beau aujourd'hui!"; A la place de il fait beau aujourd'hui on peut mettre str
            char c = 'r';
            int occurences = occurences("Il fait beau aujourd'hui!",c); // a la place de c on peut mettre 'r'
            System.out.println("Le nombre de caracteres est: " + occurences);
        }

    }

/* Correction

 */