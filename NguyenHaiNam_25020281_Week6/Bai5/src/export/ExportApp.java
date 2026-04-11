package export;
public abstract class ExportApp {
    public abstract Export createExport();

    public void export() {
        Export exporter = createExport();
        exporter.export();
    }
}
