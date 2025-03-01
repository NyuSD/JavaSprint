# Pharmacy Management System Documentation
## User Documentation
### Overview
This is a Java-based application designed to manage patient medications, prescriptions, doctors, and pharmacy inventory. It enables doctors to assign prescriptions, patients to track their medications, and pharmacy staff to restock and manage drug inventory.
### Class Descriptions and Functionality
1. Person
     - Represents a general person in the system
     - Attributes: id, name, age, phoneNumber
     - Parent class for Patient and Doctor

2. Paitent
     - Represents a paitent
     - Attributes: prescriptions, medications
     - Methods: addPrescription(), addPrescriptions()

3. Doctor
     - Represents a doctor
     - Attributes: specialization, patients
     - Methods: addPatient()

4. Medication
     - Represents a drug
     - Attributes: id, name, dose, quantityInStock, expiryDate
     - Methods: setQuantityInStock()

5. Prescription
     - Represents a doctor's prescription for a patient
     - Attributes: id, doctor, patient, medication, dateIssued, prescriptionExpiry

6. MedicationTrackingSystem
     - Manages the entire system (doctors, patients, medications, prescriptions)

       - Search: Finds doctors, patients, and medications by name
       - Add & Remove: Handles adding and deleting records
       - Restock Medications: Increases medication stock
       - Check Expired Medications: Identifies drugs past expiry
       - Generate Reports: Prints system-wide summaries

### How To Run

1. Install Java
2. Clone the repo:

```
git clone https://github.com/NyuSD/JavaSprint
cd JavaSprint
```
3. Compile
```
javac -d bin src/*.java
```
4. Run
```
java -cp bin Main
```

## Development Documentation
### Code Structrue
```
JavaSprint/
├── Person.java
├── Patient.java
├── Doctor.java
├── Medication.java
├── Prescription.java
├── MedicationTrackingSystem.java
├── Main.java
├── README.md

```
