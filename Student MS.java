import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    void display() {
        System.out.println(id + "\t" + name + "\t" + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Calculate Average Marks");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                
                case 1:
                    Student s = new Student();
                    System.out.print("Enter ID: ");
                    s.id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    s.name = sc.next();
                    System.out.print("Enter Marks: ");
                    s.marks = sc.nextInt();
                    list.add(s);
                    System.out.println("Student Added Successfully!");
                    break;

                
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("ID\tName\tMarks");
                        for (Student st : list) {
                            st.display();
                        }
                    }
                    break;

                
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Student st : list) {
                        if (st.id == searchId) {
                            System.out.println("Student Found:");
                            st.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = false;

                    for (Student st : list) {
                        if (st.id == deleteId) {
                            list.remove(st);
                            removed = true;
                            System.out.println("Student Deleted Successfully.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;

                
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        int total = 0;
                        for (Student st : list) {
                            total += st.marks;
                        }
                        double avg = (double) total / list.size();
                        System.out.println("Average Marks = " + avg);
                    }
                    break;

                
                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
