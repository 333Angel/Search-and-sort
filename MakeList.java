import java.util.*;

public class MakeList {
    private List<String> myList = new ArrayList<>();
    private String listName;
    Scanner input = new Scanner(System.in);
    

    public MakeList(String listName) {
        this.listName = listName;
    }

    public void addItem(String item) {
        myList.add(item);
    }

    public void removeItem(int index){
        myList.remove(index);
    }

    public void addItem(){
        System.out.println("Type what you would like to add to " + listName);
        String itemToAdd = input.nextLine();
        myList.add(itemToAdd);
        System.out.println(itemToAdd + "has been added!");
        }

    public void removeItem(){
        System.out.println("Which item in the list would you like to remove?");
        int i = 0;
        for (String item : myList) {
            System.out.println(i++ + ". " + item);
        }
        System.out.println("Make a selection: ");
        int ans = input.nextInt();

        String itemRemoved = myList.get(ans);
        myList.remove(ans);
        System.out.println(itemRemoved + " was removed from " + listName);
    }

    public List<String> getList(){
        return myList;
    }

    public String getListName(){
        return listName;
    }

    public String getAtIndex(int givenIndex) {
        return myList.get(givenIndex);
    }

    public void printList() {
        System.out.println(listName + ": ");
        for (String item : myList) {
            System.out.println("- " + item);
        }
    }

    public void printSequential(){
        System.out.println();
        System.out.println("Here is each item individually");
        for (String item : myList) {
            System.out.print("- " + item);
            input.nextLine();
        }
    }

    public void findDuplicates() {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String item : myList) {
            String lower = item.toLowerCase();
            if (!seen.add(lower)) {
                duplicates.add(item);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates were found in: " + listName);
        } else {
            System.out.println("Duplicates found in: " + listName + ":\n" + duplicates);
        }
    }

    public void sortList() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < myList.size() - 1; i++) {
                if (myList.get(i).compareTo(myList.get(i + 1)) > 0) {
                    String t = myList.get(i);
                    myList.set(i, myList.get(i + 1));
                    myList.set(i + 1, t);

                    swapped = true;
                }
            }
        } while (swapped); 
    }

}