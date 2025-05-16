import java.io.File;

public class CSVDataMiner extends DataMiner {

    @Override
    protected File openFile(String path) {
        System.out.println("Abriendo archivo CSV: " + path);
        return new File(path);
    }
    @Override
    protected String extractData(File file) {
        System.out.println("Extrayendo datos del CSV: " );
        return "Datos extraídos del CSV";
    }
    @Override
    protected Object parseData(String rawData) {
        System.out.println("Parseando datos del CSV...");
        return rawData;
    }

}
