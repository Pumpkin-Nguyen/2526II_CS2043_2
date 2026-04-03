package export;
public class ExcelExport implements Export {
    @Override
    public void export() {
        System.out.println("Exported to an excel file.");
    }    
}
