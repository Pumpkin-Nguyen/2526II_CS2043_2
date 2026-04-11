package export;

public class ExcelExportApp extends ExportApp {
    public Export createExport() {
        return new ExcelExport();
    }
}
