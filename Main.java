public class Main {
    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        // Creating doctors
        Doctor doctor1 = new Doctor("D001", "Dr. James", 48, "183-456-7396", "Dermatology");
        Doctor doctor2 = new Doctor("D002", "Dr. Robson", 37, "922-644-3291", "Internal Medicine");
        system.addDoctor(doctor1);
        system.addDoctor(doctor2);

        // Creating patients
        Patient patient1 = new Patient("P001", "Joe Alex", 32, "557-1254");
        Patient patient2 = new Patient("P002", "Walter White", 41, "557-5378");
        system.addPatient(patient1);
        system.addPatient(patient2);

        // Assigning patients to doctors
        system.addPatientToDoctor(doctor1, patient1);
        system.addPatientToDoctor(doctor2, patient2);

        // Creating medications
        Medication med1 = new Medication("M001", "Aspirin", "500mg", 50);
        Medication med2 = new Medication("M002", "Ibuprofen", "200mg", 30);
        system.addMedication(med1);
        system.addMedication(med2);

        // Creating prescriptions
        Prescription prescription1 = new Prescription("PR001", doctor1, patient1, med1);
        Prescription prescription2 = new Prescription("PR002", doctor2, patient2, med2);
        system.acceptPrescription(prescription1);
        system.acceptPrescription(prescription2);
    }
}
