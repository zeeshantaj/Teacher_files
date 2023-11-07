<<<<<<< HEAD
module com.example.teacher_panel_application {
=======
module com.example.teacher_panel {
>>>>>>> 43cdb3f (first commit)
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
<<<<<<< HEAD
    requires java.logging;

    opens com.example.teacher_panel_application to javafx.fxml;
    exports com.example.teacher_panel_application;
=======
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;

    opens com.example.teacher_panel to javafx.fxml;
    exports com.example.teacher_panel;
>>>>>>> 43cdb3f (first commit)
}