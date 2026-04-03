package export;
public class PdfExport implements Export {
    @Override
    public void export() {
        System.out.println("Exported to a pdf file.");
    }
}
