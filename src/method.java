public class method {
    public static void main(String[] args) {
        method.afficheMessage();
        method.afficheMessage("Tanguy", 35);

        int[] firstClass = {5,7,7,8,5};
        System.out.println(method.average(firstClass));
    }


    public static void afficheMessage() {
        System.out.println("Hello");
        System.out.println("the");
        System.out.println("World");

    }

    public static void afficheMessage(String prenom, int age) {
        System.out.println("Hello " + prenom + " I'm " + age);
    }

    public static double average(int[]numbers) {
        int total= 0;//au lieu de int mettre double
        for (int number:numbers){ //au lieu de int mettre double
            total+=number;
        }
        return total/numbers.length;
    }


}



