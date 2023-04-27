import java.util.Scanner;

public class Simulator {
    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        Coffe espresso = new Coffe("Espresso", 4.0, 250, 0, 16);
        Coffe latte = new Coffe("Latte", 7.0, 350, 75, 20);
        Coffe cappuccino = new Coffe("Cappuccino", 6.0, 200, 100, 12);
        CoffeeMachine machine = new CoffeeMachine();

        while (true) {
            System.out.println("What would you like to do? (buy/fill/take/show/analytics/exit)");
            String action = scanner.next();
            if (action.equals("buy")) {
                System.out.println("1-Espresso, 2-Latte, 3-Cappuccino, 4-Back");
                int choice = scanner.nextInt();
                Coffe coffee = null;
                switch (choice) {
                    case 1:
                        coffee = espresso;
                        break;
                    case 2:
                        coffee = latte;
                        break;
                    case 3:
                        coffee = cappuccino;
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                if (coffee != null) {
                    if (machine.canMakeCoffee(coffee)) {
                        machine.makeCoffee(coffee);
                        System.out.println("Coffee ready" + coffee.getName());
                    } else {
                        System.out.println("not enough ingredients to make " + coffee.getName());
                    }
                }
            } else if (action.equals("fill")) {
                System.out.println("How much water do you want to add (in ml)?");
                int water = scanner.nextInt();
                System.out.println("How much milk do you want to add (in ml)?");
                int milk = scanner.nextInt();
                System.out.println("How many grams of beans do you want to add?");
                int beans = scanner.nextInt();
                machine.fill(water, milk, beans);
            } else if (action.equals("take")) {
                machine.take();
            } else if (action.equals("show")) {
                machine.showIngredients();
            } else if (action.equals("analytics")) {
                machine.showAnalytics();
            } else if (action.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid action");
            }


        }
    }}
