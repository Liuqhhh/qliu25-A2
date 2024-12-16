public class Employee {
    private String name;
    private int age;
    private String gender;
    private String jobTitle;
    private int employeeID;

    public Employee(String name, int age, String gender, String jobTitle, int employeeID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
