public class CoffeeMachine {
        private int water;
        private int milk;
        private int beans;
        private double money;
        private int espressoCount;
        private int latteCount;
        private int cappuccinoCount;

        public CoffeeMachine() {
            water = 0;
            milk = 0;
            beans = 0;
            money = 0.0;
            espressoCount = 0;
            latteCount = 0;
            cappuccinoCount = 0;
        }

        public void fill(int water, int milk, int beans) {
            this.water += water;
            this.milk += milk;
            this.beans += beans;
        }

        public void take() {
            System.out.println("Money taken: $" + money);
            money = 0.0;
        }

        public void showIngredients() {
            System.out.println("Water: " + water + " ml");
            System.out.println("Milk: " + milk + " ml");
            System.out.println("Beans: " + beans + " g");
        }

        public boolean canMakeCoffee(Coffe coffee) {
            if (water >= coffee.getWater() && milk >= coffee.getMilk() && beans >= coffee.getBeans()) {
                return true;
            } else {
                return false;
            }
        }

        public void makeCoffee(Coffe coffee) {
            water -= coffee.getWater();
            milk -= coffee.getMilk();
            beans -= coffee.getBeans();
            money += coffee.getPrice();
            if (coffee.getName().equals("Espresso")) {
                espressoCount++;
            } else if (coffee.getName().equals("Latte")) {
                latteCount++;
            } else if (coffee.getName().equals("Cappuccino")) {
                cappuccinoCount++;
            }
        }

        public void showAnalytics() {
            System.out.println("Sold " + espressoCount+latteCount+cappuccinoCount);
            System.out.println("Money " + money);
            System.out.println("Water consumed: " + (espressoCount * 250 + latteCount * 350 + cappuccinoCount * 200));
            System.out.println("Milk consumed: " + (latteCount * 75 + cappuccinoCount * 100));
            System.out.println("Beans consumed: " + (espressoCount * 16 + latteCount * 20 + cappuccinoCount * 12));
        }
    }

