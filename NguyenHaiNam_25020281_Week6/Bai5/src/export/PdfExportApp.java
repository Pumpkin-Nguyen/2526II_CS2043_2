package export;

public class PdfExportApp extends ExportApp {
    public Export createExport() {
        return new PdfExport();
    }
}
