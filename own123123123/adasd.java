import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Display Student Info
    public void displayStudent() {
        System.out.println("----------------------------");
        System.out.println("Student ID: " + id);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Grade     : " + grade);
        System.out.println("----------------------------");
    }
}

public class StudentSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("===================================");
        System.out.println("   WELCOME TO STUDENT MANAGEMENT   ");
        System.out.println("===================================");

        while (running) {
            showMenu();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    removeStudent();
                    break;

                case 6:
                    System.out.println("Exiting program... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    // MENU
    public static void showMenu() {
        System.out.println("\n========= MENU =========");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Remove Student");
        System.out.println("6. Exit");
        System.out.print("Choose option: ");
    }

    // ADD STUDENT
    public static void addStudent() {
        System.out.println("\n--- Add New Student ---");

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Grade: ");
        double grade = input.nextDouble();

        Student newStudent = new Student(id, name, age, grade);
        students.add(newStudent);

        System.out.println("Student added successfully!");
    }

    // VIEW STUDENTS
    public static void viewStudents() {
        System.out.println("\n--- All Students ---");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.displayStudent();
        }
    }

    // SEARCH STUDENT
    public static void searchStudent() {
        System.out.println("\n--- Search Student ---");

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found!");
                s.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // UPDATE STUDENT
    public static void updateStudent() {
        System.out.println("\n--- Update Student ---");

        System.out.print("Enter Student ID to update: ");
        int id = input.nextInt();
        input.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {

                System.out.print("Enter new name: ");
                String newName = input.nextLine();

                System.out.print("Enter new age: ");
                int newAge = input.nextInt();

                System.out.print("Enter new grade: ");
                double newGrade = input.nextDouble();

                s.setName(newName);
                s.setAge(newAge);
                s.setGrade(newGrade);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // REMOVE STUDENT
    public static void removeStudent() {
        System.out.println("\n--- Remove Student ---");

        System.out.print("Enter Student ID to remove: ");
        int id = input.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student removed successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
