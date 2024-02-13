
package hospital;
import java.util.HashSet;



public class Doctor {
    public int doctorId;
    public String name;
    public String specialization;
    public boolean availability;
    public HashSet<String>  appointedPati;



    public Doctor(int doctorId, String name, String specialization, boolean availability) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
        this.appointedPati = new HashSet<>();
    }

    // Getter and setter methods for Doctor class

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


}
