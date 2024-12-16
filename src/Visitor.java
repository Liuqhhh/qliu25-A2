public class Visitor implements Comparable<Visitor> {
    private String name;
    private int age;
    private String gender;
    private String type;
    private boolean isVIP;

    public Visitor(String name, int age, String gender, String type, boolean isVIP) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.isVIP = isVIP;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", isVIP=" + isVIP +
                '}';
    }

    // Implement the compareTo method for sorting
    @Override
    public int compareTo(Visitor other) {
        return this.name.compareTo(other.name); // Sort by name
    }
}
