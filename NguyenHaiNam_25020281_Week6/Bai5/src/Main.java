import java.util.ArrayList;
import java.util.List;

import export.ExcelExportApp;
import export.Export;
import export.ExportApp;
import export.PdfExportApp;
import player.PlayerAdapter;

public class Main {
    public static void main(String[] args) {

        // LOGGER
        System.out.println("---Logger---");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Logger 1 - Hash code: " + logger1.hashCode());
        System.out.println("Logger 2 - Hash code: " + logger2.hashCode());
        

        // EXPORT
        System.out.println("---Export---");
        ExportApp pdfExport = new PdfExportApp();
        pdfExport.export();

        ExportApp excelExport = new ExcelExportApp();
        excelExport.export();

        // PLAYER
        System.out.println("---Player---");
        PlayerAdapter playerAdapter = new PlayerAdapter();
        playerAdapter.play("Cam on nguoi da thuc cung toi");

        // CONFIG
        System.out.println("---Config---");
        List<String> dependencies = new ArrayList<>();
        dependencies.add("spring boot");
        Config orginalConfig = new Config("bigbid", "0.0.1", dependencies);
        Config clonedConfig = orginalConfig.clone();

        clonedConfig.getDependencies().add("jpa");
        System.out.println("Orgianl Config: " + orginalConfig);
        System.out.println("Cloned Config: " + clonedConfig);
    }
}
