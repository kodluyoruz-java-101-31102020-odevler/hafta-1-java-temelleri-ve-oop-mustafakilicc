package solution6;

public class AppClass {

	public static void main(String[] args) {

		PDFDocument doc1 = new PDFDocument("Pdf Content!!");
		WordDocument doc2 = new WordDocument("Word Content!!");
		// Printer Sýnýfýnýn metodlarýna heryerden new'lemeye gerek kalmadan eriþmek için static yaptýk!!
		Printer.printPDFDocument(doc1);
		Printer.printWordDocument(doc2);
	}

}
