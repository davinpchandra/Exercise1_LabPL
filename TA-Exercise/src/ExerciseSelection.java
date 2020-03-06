import java.util.Scanner;

public class ExerciseSelection {
    public static void main(String[] args) {
        int priceProcessor = 2560000;
        int priceRAM = 1250000;
        int pricePowerSupply = 870000;
        int priceGraphicCard = 3850000;
        int priceSSD = 1050000;

        System.out.println("Computer Shop");
        System.out.println("===================");
        System.out.println("1. Processor - Rp." + priceProcessor);
        System.out.println("2. RAM - Rp." + priceRAM);
        System.out.println("3. Power Supply - Rp." + pricePowerSupply);
        System.out.println("4. Graphic Card - Rp." + priceGraphicCard);
        System.out.println("5. SSD - Rp." + priceSSD);
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose product [1-5]: ");
        int product = sc.nextInt();

        if(product == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Quantity [1-20]: ");
            int quantity = scan.nextInt();
            if(quantity >= 1 & quantity <= 20) {
                int total = quantity * priceProcessor;
                System.out.println("Total Price = Rp." + total);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input money [bigger than or equals to the price]: ");
                int money = scanner.nextInt();
                if(money == total) {
                    System.out.println("You pay with the exact amount of money!");
                }
                else if(money < total) {
                    System.out.println("You don't have enough money!");
                }
                else {
                    int change = money - total;
                    System.out.println("You get Rp." + change + " for the change.");
                }
            }
            else {
                System.out.println("Invalid Quantity!");
            }
        }
        else if(product == 2) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Quantity [1-20]: ");
            int quantity = scan.nextInt();
            if(quantity >= 1 & quantity <= 20) {
                int total = quantity * priceRAM;
                System.out.println("Total Price = Rp." + total);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input money [bigger than or equals to the price]: ");
                int money = scanner.nextInt();
                if(money == total) {
                    System.out.println("You pay with the exact amount of money!");
                }
                else if(money < total) {
                    System.out.println("You don't have enough money!");
                }
                else {
                    int change = money - total;
                    System.out.println("You get Rp." + change + " for the change.");
                }
            }
            else {
                System.out.println("Invalid Quantity!");
            }
        }
        else if(product == 3) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Quantity [1-20]: ");
            int quantity = scan.nextInt();
            if(quantity >= 1 & quantity <= 20) {
                int total = quantity * pricePowerSupply;
                System.out.println("Total Price = Rp." + total);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input money [bigger than or equals to the price]: ");
                int money = scanner.nextInt();
                if(money == total) {
                    System.out.println("You pay with the exact amount of money!");
                }
                else if(money < total) {
                    System.out.println("You don't have enough money!");
                }
                else {
                    int change = money - total;
                    System.out.println("You get Rp." + change + " for the change.");
                }
            }
            else {
                System.out.println("Invalid Quantity!");
            }
        }
        else if(product == 4) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Quantity [1-20]: ");
            int quantity = scan.nextInt();
            if(quantity >= 1 & quantity <= 20) {
                int total = quantity * priceGraphicCard;
                System.out.println("Total Price = Rp." + total);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input money [bigger than or equals to the price]: ");
                int money = scanner.nextInt();
                if(money == total) {
                    System.out.println("You pay with the exact amount of money!");
                }
                else if(money < total) {
                    System.out.println("You don't have enough money!");
                }
                else {
                    int change = money - total;
                    System.out.println("You get Rp." + change + " for the change.");
                }
            }
            else {
                System.out.println("Invalid Quantity!");
            }
        }
        else if(product == 5) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Quantity [1-20]: ");
            int quantity = scan.nextInt();
            if(quantity >= 1 & quantity <= 20) {
                int total = quantity * priceSSD;
                System.out.println("Total Price = Rp." + total);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input money [bigger than or equals to the price]: ");
                int money = scanner.nextInt();
                if(money == total) {
                    System.out.println("You pay with the exact amount of money!");
                }
                else if(money < total) {
                    System.out.println("You don't have enough money!");
                }
                else {
                    int change = money - total;
                    System.out.println("You get Rp." + change + " for the change.");
                }
            }
            else {
                System.out.println("Invalid Quantity!");
            }
        }
        else {
            System.out.println("Invalid Product!");
        }
    }
}
