package solution6;

public class AppClass {

	public static void main(String[] args) {

		PDFDocument doc1 = new PDFDocument("Pdf Content!!");
		WordDocument doc2 = new WordDocument("Word Content!!");
		// Printer S�n�f�n�n metodlar�na heryerden new'lemeye gerek kalmadan eri�mek i�in static yapt�k!!
		Printer.printPDFDocument(doc1);
		Printer.printWordDocument(doc2);
	}

}
