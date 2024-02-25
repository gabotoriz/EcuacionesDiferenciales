module utc.mx.ecuacionesdiferenciales {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens utc.mx.ecuacionesdiferenciales to javafx.fxml;
    exports utc.mx.ecuacionesdiferenciales;
}