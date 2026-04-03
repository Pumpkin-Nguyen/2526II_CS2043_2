import java.util.ArrayList;
import java.util.List;

public class ReportTemplate implements Cloneable {
    private String title, footer;
    private List<String> sectors;

    public ReportTemplate(String title, String footer, List<String> sectors) {
        this.title = title;
        this.footer = footer;
        this.sectors = sectors;
    }

    @Override
    public ReportTemplate clone() {
        try {
            ReportTemplate cloned = (ReportTemplate) super.clone();
            cloned.sectors = new ArrayList<>(this.sectors);
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Report [Title: %s | Footer: %s | Sectors: %s]".formatted(this.title, this.footer, this.sectors);
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
}
