import java.io.File;

public class PDFDataMiner extends DataMiner {
   
    @Override
    protected File openFile(String path) {
        System.out.println("Abriendo archivo PDF: " + path);
        return new File(path);
    }
    @Override
    protected String extractData(File file) {
        System.out.println("Extrayendo datos del PDF: " );
        return "Datos extraídos del PDF";
    }
    @Override
    protected Object parseData(String rawData) {
        System.out.println("Parseando datos del PDF...");
        return rawData;
    }

    
}
