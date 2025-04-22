module com.example._20lpa_code_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._20lpa_code_practice to javafx.fxml;
    exports com.example._20lpa_code_practice;
}