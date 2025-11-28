import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===CALCOLATRICE===");
        System.out.println("Primo operando:");
        double a = scanner.nextDouble();
        System.out.println("Secondo operando:");
        double b = scanner.nextDouble();

        System.out.println("Operazione (+, -, *, /, %)");
        String op = scanner.next();
        double result = 0;
        switch (op){
            case "+":
                result = a + b;
            break;
            case "-":
                result = a-b;
            break;
            
        }
        System.out.println("Risultato: " + result);
    }
}
