public class Job04 {

    public static int calcul(int a, char op, int b) {
        if (op == '+') {
            return a + b;
        }
        else if (op == '-') {
            return a - b;
        }
        else if(op == '/'){
            return a/b;
        }
        else if(op=='*') {
            return a * b;
        }
        else if(op=='%') {
            return a%b;
        }

        return 0;
    }


    public static void main(String[] args) {
        int resultat = calcul(10, '*', 5);
        System.out.println(resultat);
    }
}

/*Correction
public static double calcul(double a, char operateur, double b) {
    double result = 0
    if (operateur == '+') {
    result= a+b;
}else if (operateur == '-'){
    result= a-b;
} else {
    System.out.println("Operation no accepted");
} return result;
}
public static void main(String[] args) {
    double methodresult = calcul(5, '*', 10);
    System.out.println(methodresult);




 */



