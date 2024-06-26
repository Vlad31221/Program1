
import java.util.List;
import java.util.Scanner;



public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("1. Add patient");
            System.out.println("2. View patients by department");
            System.out.println("3. View all patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter patient department: ");
                    String department = scanner.nextLine();
                    hospital.addPatient(name, age, department);
                    break;
                case 2:
                    System.out.print("Enter department name: ");
                    department = scanner.nextLine();
                    List<Patient> patients = hospital.getPatientsByDepartment(department);
                    for (Patient patient : patients) {
                        System.out.println(patient);
                    }
                    break;
                case 3:
                    hospital.printAllPatients();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}