import java.util.*; 

public class Main
{
    public static void main(String[] args)
    {
        boolean loop = true;

        Scanner input = new Scanner(System.in);
        MakeList myList = new MakeList("Grocery List");

        myList.addItem("Apples");
        myList.addItem("Sandwich bag");
        myList.addItem("Hamburger meat");
        myList.addItem("Cucumbers");
        myList.addItem("Apples");

        System.out.println();
        myList.printList();
            
        while (loop) {
            System.out.println();
            System.out.print("Pick one of the following:"
            + "\n1. Print sequential/linear"
            + "\n2. Print out duplicates"
            + "\n3. Add something to the list"
            + "\n4. Remove something from the list"
            + "\n5. Print the entire list"
            + "\n6. Finish and sort"
            + "\nSelect: ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.println();
        
            switch (choice) {
                case 1:
                    myList.printSequential();
                    break;
                case 2:
                    myList.findDuplicates();
                    break;
                case 3:
                    myList.addItem();
                    break;
                case 4:
                    myList.removeItem();
                    break;
                case 5:
                    myList.printList();
                    break;
                case 6:
                    myList.printList();
                    System.out.println();
                    
                    myList.sortList();
                    myList.printList();
                    
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}