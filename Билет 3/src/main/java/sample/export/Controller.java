package sample.export;


    import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    public class Controller {

        @FXML
        private TextField firstName;

        @FXML
        private TextField lastName;

        @FXML
        private TextField phoneNumber;

        @FXML
        private TextField email;

        @FXML
        private Button saveToFile;

        private List<User> users = new ArrayList<>();

        @FXML
        public void saveUser() {
            String firstNameText = firstName.getText();
            String lastNameText = lastName.getText();
            String phoneNumberText = phoneNumber.getText();
            String emailText = email.getText();

            if (firstNameText.isEmpty() || lastNameText.isEmpty() || phoneNumberText.isEmpty() || emailText.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please fill in all fields");
                alert.showAndWait();
                return;
            }

            User user = new User(firstNameText, lastNameText, phoneNumberText, emailText);
            users.add(user);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("User information has been saved");
            alert.showAndWait();

            firstName.clear();
            lastName.clear();
            phoneNumber.clear();
            email.clear();
        }

        @FXML
        public void saveToFile() { //кнопка экспорта данных
            if (users.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("There is no user information to save");
                alert.showAndWait();
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (User user : users) {
                sb.append(user.getFirstName()).append(",").append(user.getLastName()).append(",")
                        .append(user.getPhoneNumber()).append(",").append(user.getEmail()).append("\n");
            }
            //код ввода данных в txt файл


        }
    }

