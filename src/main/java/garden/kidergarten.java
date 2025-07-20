package garden;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Solution by: Javs789
//
public class kidergarten {
    private static String[] children = {
            "Alice", "Bob", "Charlie", "David", "Eve", "Fred",
            "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"
    };

    private static String[] childrenPlantsFirstRow = new String[24];
    private static String[] childrenPlantsSecondRow = new String[24];

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
        for (int i = 0; i < children.length; i++) {
            System.out.println(children[i]);
        }
    }
    private static void setFirstRow(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the plants in the first row: ");
        for (int i = 0; i < childrenPlantsFirstRow.length; i++) {
            childrenPlantsFirstRow[i] = input.next();
        }
    }
    private static void setSecondRow(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the plants in the second row: ");
        for (int i = 0; i < childrenPlantsSecondRow.length; i++) {
            childrenPlantsSecondRow[i] = input.next();
        }
    }
    private static void askStudentPlants(){
        Scanner input = new Scanner(System.in);
        int studentNameIndex = 0;
        System.out.print("Enter a student name: ");
        String studentName = input.next().toLowerCase();
        if (children.equals(studentName)) {
            for (int i = 0; i < children.length; i++) {
                if (children[i].equals(studentName)) {
                    studentNameIndex = i;
                    break;
                }
            }
            System.out.println(
                    studentName + "´s plants in the first row: " + childrenPlantsFirstRow[studentNameIndex]
            );
        } else {
            System.out.println("Enter a valid student name");
        }
    }
    private static void printClassroomMap(){
        System.out.println(" [window] [window] [window] ");
        System.out.println("  . . . . . . . . . . . . ");
        System.out.println("  . . . . . . . . . . . . ");
        System.out.println("Each dot represents a cup");
    }
}


