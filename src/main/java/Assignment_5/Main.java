package Assignment_5;
//CONSTRUCTOR INJECTION
//public class Main {
//    public static void main(String[] args) {
//        ReportGenerator reportGenerator = new CSVGenerator();
//        ReportService reportService = new ReportService(reportGenerator);
//        reportService.generate();
//    }
//}

//SETTER INJECTION
public class Main{
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new PDFGenerator();
        ReportService reportService = new ReportService();
        reportService.setGenerator(reportGenerator);
        reportService.generateReport();
    }
}
