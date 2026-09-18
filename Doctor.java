public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId()
                + ", Name: " + getName()
                + ", Age: " + getAge()
                + ", Specialization: " + specialization);
    }
}
