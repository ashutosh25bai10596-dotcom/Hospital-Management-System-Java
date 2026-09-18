public class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + getId()
                + ", Name: " + getName()
                + ", Age: " + getAge()
                + ", Disease: " + disease);
    }
}
