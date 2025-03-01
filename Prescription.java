import java.time.LocalDate;

/**
 * Represents a prescription issued by a doctor for a patient.
 */
public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate dateIssued;
    private LocalDate prescriptionExpiry;

    /**
     * Constructs a new Prescription.
     *
     * @param id         The unique identifier.
     * @param doctor     The doctor who issued the prescription.
     * @param patient    The patient who received the prescription.
     * @param medication The medication prescribed.
     */

    public Prescription(String id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.dateIssued = LocalDate.now();
        this.prescriptionExpiry = dateIssued.plusYears(1);
    }

    /**
     * Gets the unique identifier.
     *
     * @return The unique identifier.
     */

    public String getId() {
        return id;
    }

    /**
     * Gets the doctor who issued the prescription.
     *
     * @return The doctor.
     */

    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Gets the patient who received the prescription.
     *
     * @return The patient.
     */

    public Patient getPatient() {
        return patient;
    }

    /**
     * Gets the medication prescribed.
     *
     * @return The medication.
     */

    public Medication getMedication() {
        return medication;
    }

    /**
     * Gets the date the prescription was issued.
     *
     * @return The date issued.
     */

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    /**
     * Gets the expiry date of the prescription.
     *
     * @return The expiry date.
     */

    public LocalDate getPrescriptionExpiry() {
        return prescriptionExpiry;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id='" + id + '\'' +
                ", doctor=" + doctor.getName() +
                ", patient=" + patient.getName() +
                ", medication=" + medication.getName() +
                ", dateIssued=" + dateIssued +
                ", prescriptionExpiry=" + prescriptionExpiry +
                '}';
    }
}
