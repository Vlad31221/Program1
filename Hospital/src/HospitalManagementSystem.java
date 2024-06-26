
import java.util.List;
import java.util.Scanner;



public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("1. Добавить пациента");
            System.out.println("2. Показать пациентов по отделениям");
            System.out.println("3. Показать всех пациентов");
            System.out.println("4. Выход");
            System.out.print("Введите номер: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Введите имя пациента: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Введите название отделения: ");
                    String department = scanner.nextLine();
                    hospital.addPatient(name, age, department);
                    break;
                case 2:
                    System.out.print("Введите название отделения: ");
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
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверное значение, попробуйте еще раз.");
            }
        }
    }
}
