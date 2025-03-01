import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicationTrackingSystem {
    private List<Patient> patients;
    private List<Medication> medications;
    private List<Doctor> doctors;

    public MedicationTrackingSystem() {
        this.patients = new ArrayList<>();
        this.medications = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public Medication searchMedicationByName(String name) {
        return medications.stream()
                .filter(m -> m.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Patient searchPatientByName(String name) {
        return patients.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Doctor searchDoctorByName(String name) {
        return doctors.stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void addPatientToDoctor(Doctor doctor, Patient patient) {
        doctor.addPatient(patient);
    }

    public void acceptPrescription(Prescription prescription) {
        prescription.getPatient().addPrescription(prescription);
        prescription.getPatient().addMedication(prescription.getMedication());
    }

    public void addMedication(Medication medication) {
        this.medications.add(medication);
    }

    public void removeMedication(String medicationId) {
        medications.removeIf(m -> m.getId().equals(medicationId));
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public void removePatient(String patientId) {
        patients.removeIf(p -> p.getId().equals(patientId));
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void removeDoctor(String doctorId) {
        doctors.removeIf(d -> d.getId().equals(doctorId));
    }

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
