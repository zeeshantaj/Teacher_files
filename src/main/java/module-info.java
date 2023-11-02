module com.example.teacher_panel_application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.logging;

    opens com.example.teacher_panel_application to javafx.fxml;
    exports com.example.teacher_panel_application;
}