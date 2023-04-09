import java.util.Scanner;
public class Libery extends Encap {
        public void option(){
            System.out.println("1. Show all books");
            System.out.println("2. Available books");
            System.out.println("3. Borrow books");
            System.out.println("4. Return books");
            System.out.println("5. Exit");
            System.out.println();
        }
        private int choice;
        public int Switch(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            return choice;
        }
}
