package Strategy;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        double firstNumber = Double.parseDouble(sc.nextLine());
        double secondNumber = Double.parseDouble(sc.nextLine());
        boolean b=true;
        while (b){
            b=false;
            String action= sc.nextLine();
            switch (action){
                case "addition":
                    context.setStrategy(new ConcreteStrategyAdd());
                    break;
                case "subtraction":
                    context.setStrategy(new ConcreteStrategySubtract());
                    break;
                case "multiplication":
                    context.setStrategy(new ConcreteStrategyMultiply());
                    break;
                default:
                    System.out.println("please type action again");
                    b=true;
                    break;
            }
        }
        System.out.println(context.executeStrategy(firstNumber,secondNumber));

    }
}
