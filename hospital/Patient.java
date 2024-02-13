
package hospital;
import java.util.ArrayList;
import java.util.List;


   
public class Patient {
    public int patientId;
    public String name;
    public int age;
    public String gender;
    public  List<String> medicalRecords;

    public Patient(int patientId, String name, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.medicalRecords = new ArrayList<>();
    }

 

    public void addMedicalRecord(String record) {
        medicalRecords.add(record);
    }
}

