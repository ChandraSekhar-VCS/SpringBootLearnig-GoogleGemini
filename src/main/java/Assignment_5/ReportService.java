package Assignment_5;
//CONSTRUCTOR INJECTION
//public class ReportService {
//    private ReportGenerator reportGenerator;
//    public ReportService(ReportGenerator reportGenerator){
//        this.reportGenerator = reportGenerator;
//    }
//    public void generate(){
//        reportGenerator.generateReport();
//    }
//}

//SETTER INJECTION
public class ReportService {
    private ReportGenerator reportGenerator;
    public void setGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
    public void generateReport() {
        reportGenerator.generateReport();
    }
}
