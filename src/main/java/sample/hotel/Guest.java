package sample.hotel;

public class Guest {
    private String firstName;
    private String lastName;
    private String roomNumber;
    private String checkInDate;

    public Guest(String firstName, String lastName, String roomNumber, String checkInDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }
}
