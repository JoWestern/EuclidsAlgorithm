public class Algorithm {

    public static void main(String[] args) {
        run(50, 11);
    }

    public static void run(int num1, int num2) {
 
        int svar;

        System.out.println("Inputtall er: " + num1 + " og " + num2);

        while (num1 >= num2) {

            svar = modulo(num1, num2);
            System.out.println("rest: " + svar);

            if (svar == 0) {
                System.out.println("ferdig");
                break;
            }

            num1 = num2;
            num2 = svar;

            System.out.println(num1 + " % " + num2);

        }
    }

    public static int modulo(int x, int y) {
        int rest = x % y;
        return rest;
    }
}
