import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class Ride {
    private String rideName;
    private int maxCapacity;
    private Employee rideOperator;
    private LinkedList<Visitor> rideHistory = new LinkedList<>();
    private int maxRiders;

    // Constructor
    public Ride(String rideName, int maxCapacity, Employee rideOperator, int maxRiders) {
        this.rideName = rideName;
        this.maxCapacity = maxCapacity;
        this.rideOperator = rideOperator;
        this.maxRiders = maxRiders;
    }

    public Ride(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    // Add a visitor to the ride history
    public void addVisitorToHistory(Visitor visitor) {
        if (rideHistory.size() < maxCapacity) {
            rideHistory.add(visitor);
        } else {
            System.out.println("The ride is at full capacity, can't add more visitors.");
        }
    }

    // Print the ride history
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor);
        }
    }

    // Export the ride history to a file
    public void exportRideHistory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rideName + "_History.csv"))) {
            // Write file header (if needed)
            writer.write("Name, Age, Gender, Type, IsVIP\n");

            // Write the ride history
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," +
                        visitor.getAge() + "," +
                        visitor.getGender() + "," +
                        visitor.getType() + "," +
                        visitor.isVIP() + "\n");
            }
            System.out.println("Ride history exported successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while exporting the ride history: " + e.getMessage());
        }
    }

    // Import the ride history from a file
    public void importRideHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(rideName + "_History.csv"))) {
            String line;
            // Skip the first line (header)
            reader.readLine();

            // Read each line of visitor data and add it to rideHistory
            while ((line = reader.readLine()) != null) {
                String[] visitorData = line.split(",");
                if (visitorData.length == 5) {
                    String name = visitorData[0];
                    int age = Integer.parseInt(visitorData[1]);
                    String gender = visitorData[2];
                    String type = visitorData[3];
                    boolean isVIP = Boolean.parseBoolean(visitorData[4]);

                    // Create a Visitor object and add it to history
                    Visitor visitor = new Visitor(name, age, gender, type, isVIP);
                    rideHistory.add(visitor);
                }
            }
            System.out.println("Ride history imported successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while importing the ride history: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error in data format while importing: " + e.getMessage());
        }
    }

    // Sort the ride history
    public void sortRideHistory() {
        Collections.sort(rideHistory, new Comparator<Visitor>() {
            @Override
            public int compare(Visitor v1, Visitor v2) {
                return v1.getName().compareTo(v2.getName()); // Sort by name
            }
        });
        System.out.println("Ride history sorted by name.");
    }

    // Get the ride history
    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }
}
