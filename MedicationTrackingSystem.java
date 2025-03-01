import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Manages the pharmacy system, including doctors, patients, and medications.
 */
public class MedicationTrackingSystem {
    private List<Patient> patients;
    private List<Medication> medications;
    private List<Doctor> doctors;

    /**
     * Constructs a new MedicationTrackingSystem.
     */

    public MedicationTrackingSystem() {
        this.patients = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    /**
     * Searches for a medication by name.
     *
     * @param name The name of the medication.
     * @return The medication with the given name, or null if not found.
     */

    public Medication searchMedicationByName(String name) {
        return medications.stream()
                .filter(m -> m.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    /**
     * Searches for a patient by name.
     *
     * @param name The name of the patient.
     * @return The patient with the given name, or null if not found.
     */

    public Patient searchPatientByName(String name) {
        return patients.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    /**
     * Searches for a doctor by name.
     *
     * @param name The name of the doctor.
     * @return The doctor with the given name, or null if not found.
     */

    public Doctor searchDoctorByName(String name) {
        return doctors.stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    /**
     * Adds a patient to a doctor's list of patients.
     *
     * @param doctor  The doctor to add the patient to.
     * @param patient The patient to add.
     */

    public void addPatientToDoctor(Doctor doctor, Patient patient) {
        doctor.addPatient(patient);
    }

    /**
     * Adds a doctor to the system.
     *
     * @param doctor The doctor to add.
     */

    public void acceptPrescription(Prescription prescription) {
        prescription.getPatient().addPrescription(prescription);
        prescription.getPatient().addMedication(prescription.getMedication());
    }

    /**
     * Adds a medication to the system.
     *
     * @param medication The medication to add.
     */

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    /**
     * Removes a medication from the system.
     *
     * @param medicationId The unique identifier of the medication to remove.
     */

    public void removeMedication(String medicationId) {
        medications.removeIf(m -> m.getId().equals(medicationId));
    }

    /**
     * Adds a patient to the system.
     *
     * @param patient The patient to add.
     */

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    /**
     * Removes a patient from the system.
     *
     * @param patientId The unique identifier of the patient to remove.
     */

    public void removePatient(String patientId) {
        patients.removeIf(p -> p.getId().equals(patientId));
    }

    /**
     * Adds a doctor to the system.
     *
     * @param doctor The doctor to add.
     */

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    /**
     * Removes a doctor from the system.
     *
     * @param doctorId The unique identifier of the doctor to remove.
     */

    public void removeDoctor(String doctorId) {
        doctors.removeIf(d -> d.getId().equals(doctorId));
    }

    /**
     * Generates a report of the system.
     */

    public void generateReport() {
        System.out.println("=== Medication Report ===");
        medications.forEach(System.out::println);

        System.out.println("\n=== Patient Report ===");
        patients.forEach(System.out::println);

        System.out.println("\n=== Doctor Report ===");
        doctors.forEach(System.out::println);

        System.out.println("\n=== Prescription Report (by Patient) ===");
        for (Patient p : patients) {
            System.out.println("Patient: " + p.getName());
            p.getPrescriptions().forEach(System.out::println);
        }
    }

    /**
     * Checks for expired medications.
     */

    public void checkExpiredMedications() {
        List<Medication> expired = medications.stream()
                .filter(m -> m.getExpiryDate().isBefore(java.time.LocalDate.now()))
                .collect(Collectors.toList());

        if (!expired.isEmpty()) {
            System.out.println("The following medications have expired:");
            expired.forEach(System.out::println);
        } else {
            System.out.println("No expired medications found.");
        }
    }

    /**
     * Prints prescriptions issued by a doctor.
     *
     * @param doctorName The name of the doctor.
     */

    public void printPrescriptionsByDoctor(String doctorName) {
        Doctor doctor = searchDoctorByName(doctorName);
        if (doctor != null) {
            System.out.println("=== Prescriptions issued by Dr. " + doctorName + " ===");
            for (Patient p : patients) {
                p.getPrescriptions().stream()
                        .filter(pr -> pr.getDoctor().equals(doctor))
                        .forEach(System.out::println);
            }
        } else {
            System.out.println("Doctor not found.");
        }
    }

    /**
     * Restocks a medication.
     *
     * @param medicationName The name of the medication to restock.
     */

    public void restockMedication(String medicationName) {
        Medication medication = searchMedicationByName(medicationName);
        if (medication != null) {
            int randomStockIncrement = (int) (Math.random() * 50 + 1);
            medication.setQuantityInStock(medication.getQuantityInStock() + randomStockIncrement);
            System.out.println("Restocked " + randomStockIncrement + " units of " + medicationName);
        } else {
            System.out.println("Medication not found.");
        }
    }
}
