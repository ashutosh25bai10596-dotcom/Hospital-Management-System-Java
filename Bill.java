public class Bill {
    private int billId;
    private int patientId;
    private double amount;

    public Bill(int billId, int patientId, double amount) {
        this.billId = billId;
        this.patientId = patientId;
        this.amount = amount;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId
                + ", Patient ID: " + patientId
                + ", Amount: Rs. " + amount);
    }
}
