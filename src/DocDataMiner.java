import java.io.File;

public class DocDataMiner extends DataMiner {
    @Override
    protected File openFile(String path) {
        System.out.println("Abriendo archivo de documento: " + path);
        return new File(path);
    }

    @Override
    protected String extractData(File file) {
        System.out.println("Extrayendo datos del documento: " );
        return "Datos extraídos del documento";
    }

    @Override
    protected Object parseData(String rawData) {
        System.out.println("Parseando datos del documento...");
        return rawData;
    }

}
