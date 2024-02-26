module utc.mx.ecuacionesdiferenciales {
    requires MaterialFX;
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
    exports utc.mx.ecuacionesdiferenciales.Controllers;
    opens utc.mx.ecuacionesdiferenciales.Controllers to javafx.fxml;
}