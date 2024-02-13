
package hospital;
 import com.sun.security.jgss.GSSUtil;
import hospital.Appointment;
import hospital.Doctor;
import hospital.Patient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class MedicalRecordSystem {
    public static void main(String[] args) {
        Appointment appointments = new Appointment();
        appointments.addPatients(new Patient(1, "joe", 30, "Male"));
        appointments.addPatients(new Patient(2, "dilkush", 30, "Male"));
        appointments.addPatients( new Patient(3, "John shay", 30, "Male"));
        appointments.addPatients( new Patient(4, "bobby", 30, "Male"));
        appointments.addPatients(new Patient(5, "Joggapa", 30, "Male"));
        appointments.addPatients(new Patient(6, "princy doe", 30, "Male"));
        appointments.addPatients(new Patient(7, "jasica", 30, "Male"));
        appointments.addPatients(new Patient(8, "rammana", 30, "Male"));
        appointments.addPatients(new Patient(9, "sanjeeva", 30, "Male"));
        appointments.addPatients(new Patient(10, "sonthas", 30, "Male"));
        appointments.addPatients(new Patient(11, "loory", 30, "Male"));
        appointments.addPatients(new Patient(12, "joggy", 30, "Male"));




        appointments.addDoctor( new Doctor(101, "Dr. Johnson", "Cardiologist", false));
        appointments.addDoctor( new Doctor(102, "Dr. Bob", "Cardiologist", false));
        appointments.addDoctor( new Doctor(103, "Dr. Tony", "Cardiologist",true));
        appointments.addDoctor( new Doctor(104, "Dr. Tim", "Cardiologist", false));

        

           System.out.println(" Choose from below menu");    
           System.out.println(" 1. Doctors available");  
           System.out.println(" 2. Patient records"); 
           System.out.println("3. Current status");
        System.out.print("Please enter your choise : ");
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        menu = scanner.nextInt();

        switch (menu){
            case 1 :
                for(Doctor doctor : appointments.doctors){
                    System.out.println((doctor.availability)? doctor.name + " is available " : "");
                  //  System.out.println("specialization"+ doctor.specialization);         
                }
                break;
            case 2 :
                System.out.println("Below are the patient");
                for(Patient patient: appointments.patients){
                    System.out.println("Name : " + patient.name);
                    System.out.println("age : " + patient.age);
                    System.out.println("Gender:"+ patient.gender);
                    
                }
                break;
          
             
    case 3:
        //int appId = 1001;
        //appointments.allocatePatients();
        System.out.println("Current status:");
        for (Doctor doctor : appointments.doctors) {
            System.out.println("Doctor: " + doctor.name);
            System.out.println("Specialization: " + doctor.specialization);
            System.out.println("Availability: " + (doctor.availability ? "Available" : "Not available"));
            System.out.println("Assigned Patients:");
            for (Patient patient : appointments.patients)
            {
                System.out.println("- " + patient.patientId);
            }
            System.out.println();
        }
        break;
    default:
        System.out.println("Invalid choice!");
        break;
     }
        }
    }




