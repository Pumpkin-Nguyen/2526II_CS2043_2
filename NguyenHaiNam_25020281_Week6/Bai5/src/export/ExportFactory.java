package export;
public class ExportFactory {
    public static Export getExport(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PdfExport();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelExport();
        }

        return null;
    }
}
