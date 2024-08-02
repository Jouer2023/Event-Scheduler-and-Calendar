import java.time.LocalDateTime;

public class Event {
    private static int eventNumber = 0; // Static counter to generate unique IDs for each event
    private int id; // Unique identifier for the event
    private String title; // Title or name of the event
    private LocalDateTime dateTime; // Date and time when the event is scheduled
    private String location; // Location where the event will take place
    private String description; // Additional details or notes about the event

    // Constructor to initialize an Event object with all necessary details
    public Event(String title, LocalDateTime dateTime, String location, String description) {
        this.id = eventNumber++; // Assign a unique ID and increment the counter for the next event
        this.title = title;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
    }

    // Getters and setters for accessing and modifying the private fields

    public int getId() {
        return id; // Returns the unique ID of the event
    }

    public String getTitle() {
        return title; // Returns the title of the event
    }

    public void setTitle(String title) {
        this.title = title; // Sets a new title for the event
    }

    public LocalDateTime getDateTime() {
        return dateTime; // Returns the date and time of the event
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime; // Sets a new date and time for the event
    }

    public String getLocation() {
        return location; // Returns the location of the event
    }

    public void setLocation(String location) {
        this.location = location; // Sets a new location for the event
    }

    public String getDescription() {
        return description; // Returns the description of the event
    }

    public void setDescription(String description) {
        this.description = description; // Sets a new description for the event
    }

    // toString method to provide a readable string representation of the event
    @Override
    public String toString() {
        return "Event{" +
                "id=" + id + // Displays the unique ID of the event
                ", title='" + title + '\'' + // Displays the title of the event
                ", dateTime=" + dateTime + // Displays the date and time of the event
                ", location='" + location + '\'' + // Displays the location of the event
                ", description='" + description + '\'' + // Displays the description of the event
                '}';
    }
}
