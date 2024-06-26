import java.util.List;
import java.util.ArrayList;

class Hospital {
    private List<Patient> patients;

    public Hospital() {
        patients = new ArrayList<>();
    }

    public void addPatient(String name, int age, String department) {
        patients.add(new Patient(name, age, department));
    }

    public List<Patient> getPatientsByDepartment(String department) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getDepartment().equalsIgnoreCase(department)) {
                result.add(patient);
            }
        }
        return result;
    }

    public void printAllPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
