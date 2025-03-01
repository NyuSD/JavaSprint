import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patient in the pharmacy system.
 * A patient has a list of medications and prescriptions.
 */
public class Patient extends Person {
    private List<Medication> medications;
    private List<Prescription> prescriptions;

    /**
     * Constructs a new Patient.
     *
     * @param id          The unique identifier.
     * @param name        The name of the patient.
     * @param age         The age of the patient.
     * @param phoneNumber The contact number.
     */

    public Patient(String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
        this.medications = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    /**
     * Gets the list of medications.
     *
     * @return The list of medications.
     */

    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Adds a medication to the list.
     *
     * @param medication The medication to add.
     */

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    /**
     * Gets the list of prescriptions.
     *
     * @return The list of prescriptions.
     */

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Adds a prescription to the list.
     *
     * @param prescription The prescription to add.
     */

    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", medications=" + medications +
                ", prescriptions=" + prescriptions +
                '}';
    }
}
