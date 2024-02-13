

package hospital;
import java.sql.Array;
import java.util.HashSet;

public class Appointment {
    
    public int appointment;
    public HashSet<Doctor> doctors;
    public HashSet<Patient> patients;
    int counter;
    int nameCounter;
    private String[] patientsName;


    public Appointment() {
        this.doctors = new HashSet<Doctor>();
        this.patients = new HashSet<Patient>();
        this.counter = 0;
        this.nameCounter = 0;

        this.patientsName = new String[100];

    }


    private void toArrays() {
        for (Patient patient : patients) {
            patientsName[nameCounter] = patient.name;
            nameCounter++;
        }
    }


    public void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    public void addPatients(Patient pet) {
        patients.add(pet);
    }


    public void allocatePatients() {
        this.toArrays();
        System.out.println("called");
        for (Doctor doctor : doctors) {
            System.out.println("called 2");
            for (int i = 0; i <= patients.size(); i++) {
                if (doctor.appointedPati.size() >= 4) {
                    doctor.availability = false;
                    continue;
                }
                doctor.appointedPati.add(patientsName[counter]);
                counter++;
            }
           
    }
}
}
