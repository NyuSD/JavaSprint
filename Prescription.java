import java.time.LocalDate;

public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate dateIssued;
    private LocalDate prescriptionExpiry;

    public Prescription(String id, Doctor doctor, Patient patient, Medication medication) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.dateIssued = LocalDate.now();
        this.prescriptionExpiry = dateIssued.plusYears(1);
    }

    public String getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

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
