public class Main {
    public static void main(String[] args) {
        Report report1 = new Report("Report 1", "Scammer");
        Report report2 = new Report("Report 2", "Bank Phishing");

        System.out.println("---JSON format---");
        ReportService service1 = new ReportService(new JsonFormatter());
        System.out.println(service1.export(report1));

        System.out.println("---XML format---");
        ReportService service2 = new ReportService(new XmlFormatter());
        System.out.println(service2.export(report2));
    }
}
