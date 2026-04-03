public class ReportService {
    private ReportFormatter reportFormatter;

    public ReportService(ReportFormatter reportFormatter) {
        this.reportFormatter = reportFormatter;
    }

    public String export(Report data) {
        return reportFormatter.format(data);
    }
}
