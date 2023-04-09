import java.util.Scanner;

public class Main{
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Poly i = new Poly();

        String a;
        String b;
        String c;

        i.welcome();

        System.out.println("Enter your name: ");
        i.setName(input.nextLine());
        System.out.println("Enter your ID: ");
        i.setId(input.nextLine());
        System.out.println("Enter your department: ");
        i.setDept(input.nextLine());

        System.out.println("Name: "+i.getName());
        System.out.println("ID: "+i.getId());
        System.out.println("Department: "+i.getDept());
        System.out.println();

while(true) {
    i.option();
    int choice = i.Switch();
    switch (choice) {
        case 1:
            System.out.println("Show all books");
            System.out.println("1. Java");
            System.out.println("2. Python");
            System.out.println("3. C++");
            break;
        case 2:
            System.out.println("Available books");
            System.out.println("1. Java");
            System.out.println("2. Python");
            System.out.println("3. C++");
            break;
        case 3:
            System.out.println("Borrow books");
            a = input.nextLine();
            if (a.equals("Java")) {
                System.out.println("You have borrowed Java");
            } else if (a.equals("Python")) {
                System.out.println("You have borrowed Python");
            } else if (a.equals("C++")) {
                System.out.println("You have borrowed C++");
            } else {
                System.out.println("This book is not available");
            }

            break;
        case 4:
            System.out.println("Return books");
            b = input.nextLine();
            if (b.equals("Java")) {
                System.out.println("You return " + b);
            } else if (b.equals("Python")) {
                System.out.println("You return " + b);
            } else if (b.equals("C++")) {
                System.out.println("You return " + b);
            } else {
                System.out.println("You don't borrow this book");
            }

            break;
        case 5:
            System.out.println("Exit");
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
    System.out.println("Do you want to continue? (y/n)");
    c = input.nextLine();
    if (c.equals("n")) {
        break;
    }
}
    }
}