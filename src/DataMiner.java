
import java.io.File;


public abstract class DataMiner {
    
    public void mine(String path) {
        File file = openFile(path);
        String rawData = extractData(file);
        Object data = parseData(rawData);
        Object analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    protected abstract File openFile(String path);
    protected abstract String extractData(File file);
    protected abstract Object parseData(String rawData);

    protected  Object analyzeData(Object data) {
        System.out.println("Analizando datos...");
        return data;
    }
    protected void sendReport(Object analysis) {
        System.out.println("Enviando reporte con analisis: "+ analysis.toString());
    }
    protected void closeFile(File file) {
        System.out.println("Cerrando archivo: " + file.getName());
    }

}
