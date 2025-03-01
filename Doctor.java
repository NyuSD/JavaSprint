import java.util.ArrayList;
import java.util.List;

/**
 * Represents a doctor in the system.
 * A doctor can have a specialization and manage multiple patients.
 */

public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    /**
     * Constructs a new Doctor.
     *
     * @param id            The unique identifier.
     * @param name          The name of the doctor.
     * @param age           The age of the doctor.
     * @param phoneNumber   The contact number.
     * @param specialization The specialization of the doctor.
     */

    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    /**
     * Gets the specialization of the doctor.
     *
     * @return The specialization of the doctor.
     */

    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the specialization of the doctor.
     *
     * @param specialization The specialization of the doctor.
     */

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the list of patients managed by the doctor.
     *
     * @return The list of patients.
     */

    public List<Patient> getPatients() {
        return patients;
    }

    /**
     * Adds a patient to the list.
     *
     * @param patient The patient to add.
     */

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", specialization='" + specialization + '\'' +
                ", patients=" + patients +
                '}';
    }
}