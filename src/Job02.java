public class Job02 {

    public static void bonjour(boolean jour) {
        if (jour==true){// idem que if (jour)
        System.out.println("Bonjour");
        }
        else {
                System.out.println("Bonsoir");
            }
    }

    public static void main(String[] args) {
        bonjour(true);//or false
    }

}
