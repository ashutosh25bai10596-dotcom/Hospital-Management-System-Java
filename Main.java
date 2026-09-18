import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();
    static ArrayList<Bill> bills = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=================================");
            System.out.println("   HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Generate Bill");
            System.out.println("8. View Bills");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addPatient();
                    case 2 -> viewPatients();
                    case 3 -> addDoctor();
                    case 4 -> viewDoctors();
                    case 5 -> bookAppointment();
                    case 6 -> viewAppointments();
                    case 7 -> generateBill();
                    case 8 -> viewBills();
                    case 9 -> {
                        System.out.println("Thank you for using HMS!");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patient records found.");
            return;
        }

        System.out.println("\n--- Patient Records ---");
        for (Patient p : patients) {
            p.displayDetails();
        }
    }

    static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        doctors.add(new Doctor(id, name, age, specialization));
        System.out.println("Doctor added successfully!");
    }

    static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctor records found.");
            return;
        }

        System.out.println("\n--- Doctor Records ---");
        for (Doctor d : doctors) {
            d.displayDetails();
        }
    }

    static void bookAppointment() {
        System.out.print("Enter Appointment ID: ");
        int appointmentId = sc.nextInt();

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();

        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Appointment Date: ");
        String date = sc.nextLine();

        appointments.add(new Appointment(
                appointmentId, patientId, doctorId, date));

        System.out.println("Appointment booked successfully!");
    }

    static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        System.out.println("\n--- Appointments ---");
        for (Appointment a : appointments) {
            a.displayAppointment();
        }
    }

    static void generateBill() {
        System.out.print("Enter Bill ID: ");
        int billId = sc.nextInt();

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        bills.add(new Bill(billId, patientId, amount));
        System.out.println("Bill generated successfully!");
    }

    static void viewBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills found.");
            return;
        }

        System.out.println("\n--- Bills ---");
        for (Bill b : bills) {
            b.displayBill();
        }
    }
}
