public class App {
    public static void main(String[] args)  {
        
        DataMiner pdfDataMiner = new PDFDataMiner();
        pdfDataMiner.mine("documento.pdf");

        System.out.println("------------------------------------------------");

        DataMiner docDataMiner = new DocDataMiner();
        docDataMiner.mine("documento.docx");

        System.out.println("------------------------------------------------");

        DataMiner csvDataMiner = new CSVDataMiner();
        csvDataMiner.mine("datos.csv");
        
        System.out.println("------------------------------------------------");
    }
}
