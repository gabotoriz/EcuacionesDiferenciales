package utc.mx.ecuacionesdiferenciales;

public enum Views {
    Selection("selection-view.fxml");

    private final String FileName;

    Views(String fileName){
        FileName = fileName;
    }

    public String getFileName() {
        return FileName;
    }
}
