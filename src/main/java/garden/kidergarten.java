package garden;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Solution by: Javs789
//
public class kidergarten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("System initializing...");
        Integer selectedOption = 0;
        Boolean exit = false;
        printClassroomMap();
        while (!exit) {
            //TODO: Add Miss name
            System.out.println("Welcome to the kindergarten of Miss __");
            System.out.println("Select an option to continue: ");
            System.out.println("1. List Children");
            System.out.println("2. Set first row");
            System.out.println("3. Set second row");
            System.out.println("4. Ask Student's plant");
            System.out.println("5. Print the map of the classroom");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            selectedOption = input.nextInt();
            switch (selectedOption) {
                case 1:
                    listChildren();
                    break;
                case 2:
                    setFirstRow();
                    break;
                case 3:
                    setSecondRow();
                    break;
                case 4:
                    askStudentPlants();
                    break;
                case 5:
                    printClassroomMap();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }

    private static void listChildren(){
        System.out.println("List of children: ");
        System.out.println("Alice");
        System.out.println("Bob");
        System.out.println("Charlie");
        System.out.println("David");
        System.out.println("Eve");
        System.out.println("Fred");
        System.out.println("Ginny");
        System.out.println("Harriet");
        System.out.println("Ileana");
        System.out.println("Joseph");
        System.out.println("Kincaid");
        System.out.println("Larry");
    }
    private static void setFirstRow(){
        Scanner input = new Scanner(System.in);
        String[] childrenPlants = new String[12];
        for (int i = 0; i < childrenPlants.length; i++) {
            childrenPlants[i] = input.next();
        }
    }
    private static void setSecondRow(){}
    private static void askStudentPlants(){}
    private static void printClassroomMap(){
        System.out.println(" [window] [window] [window] ");
        System.out.println("  . . . . . . . . . . . . ");
        System.out.println("  . . . . . . . . . . . . ");
        System.out.println("Each dot represents a cup");
    }
}


