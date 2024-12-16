public class AssignmentTwo {
    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();  // Add the partSix method call
        partSeven(); // Add the partSeven method call
    }

    public static void partThree() {
        // Create the Ride and Visitor objects
        Employee operator = new Employee("Alice", 30, "Female", "Ride Operator", 101);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 5);

        Visitor v1 = new Visitor("John", 25, "Male", "Standard", true);
        Visitor v2 = new Visitor("Mary", 28, "Female", "VIP", false);
        // Add visitors to history
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);

        // Print history
        rollerCoaster.printRideHistory();
    }

    public static void partFourA() {
        // Create the Ride and Visitor objects
        Employee operator = new Employee("Alice", 30, "Female", "Ride Operator", 101);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 5);

        // Add visitors to history
        Visitor v1 = new Visitor("John", 25, "Male", "Standard", true);
        rollerCoaster.addVisitorToHistory(v1);

        // Print history
        rollerCoaster.printRideHistory();
    }

    public static void partFourB() {
        // Create the Ride and Visitor objects
        Employee operator = new Employee("Alice", 30, "Female", "Ride Operator", 101);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 5);

        // Add visitors to history
        Visitor v1 = new Visitor("John", 25, "Male", "Standard", true);
        Visitor v2 = new Visitor("Mary", 28, "Female", "VIP", false);
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);

        // Sort the history
        rollerCoaster.sortRideHistory();
        rollerCoaster.printRideHistory();
    }

    public static void partFive() {
        // Create a new Ride object, assuming you can receive up to 5 visitors per cycle
        Ride ride = new Ride(5);

        // Add 10 visitors to the queue
        for (int i = 1; i <= 10; i++) {
            Visitor visitor = new Visitor("Visitor" + i, 20 + i, "Male", "Standard", false); // Use a simplified constructor
            ride.addVisitorToHistory(visitor);
        }

        // Print all visitors in the queue
        System.out.println("Visitors in a queue：");
        ride.printRideHistory();
    }

    public static void partSix() {
        // Create a new Ride object and add visitors to the history
        Employee operator = new Employee("Alice", 30, "Female", "Ride Operator", 101);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 5);

        // Add visitors to history

    }
    public static void partSeven() {
        // Create a Ride object
        Employee operator = new Employee("Alice", 30, "Female", "Ride Operator", 101);
        Ride rollerCoaster = new Ride("Roller Coaster", 10, operator, 5);

        // Import visitor history from file
        rollerCoaster.importRideHistory(); // Assume that the file already exists
        // Print the imported visitor history
        rollerCoaster.printRideHistory();
    }
}