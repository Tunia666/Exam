package sample.hotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    public TableColumn firstNameCol;
    public TableColumn lastNameCol;
    public TableColumn roomNumberCol;
    public TableColumn checkInDateCol;
    public TextField firstNameInput;
    public TextField lastNameInput;
    public TextField roomNumberInput;
    public TextField checkInDateInput;
    public Button addGuestButton;
    @FXML
    private TableView<Guest> guestTable;


    /**
     * Initializes the controller class.
     */
    public void initialize() {
        // Set up the columns in the guestTable
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("lastName"));
        roomNumberCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("roomNumber"));
        checkInDateCol.setCellValueFactory(new PropertyValueFactory<Guest, String>("checkInDate"));
    }

    @FXML
    private void handleAddButtonAction() {
        // Get data from the input fields
        String firstName = firstNameInput.getText();
        String lastName = lastNameInput.getText();
        String roomNumber = roomNumberInput.getText();
        String checkInDate = checkInDateInput.getText();

        // Create a new guest object and add it to the table
        Guest newGuest = new Guest(firstName, lastName, roomNumber, checkInDate);
        guestTable.getItems().add(newGuest);

        // Clear the input fields
        firstNameInput.clear();
        lastNameInput.clear();
        roomNumberInput.clear();
        checkInDateInput.clear();
    }

    public void addGuest(ActionEvent actionEvent) {
        handleAddButtonAction();

    }

    public void export(ActionEvent actionEvent) {

    }


    public void print(ActionEvent actionEvent) {
    }

    public void close(ActionEvent actionEvent) {
    }
}
