package utc.mx.ecuacionesdiferenciales;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Views {
    Selection("selection-view.fxml"),
    Teoria("teoria-view.fxml"),
    Basicos("ejemplos-basicos.view.fxml"),
    Avanzados("ejemplos-avanzados-view.fxml"),
    Cuestionario("cuestionario-view.fxml");
    String FileName;
    Views(String fileName) {
        FileName = fileName;
    }
}
