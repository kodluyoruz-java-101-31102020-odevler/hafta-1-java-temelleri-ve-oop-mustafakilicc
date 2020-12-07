package solution7;

public class PersonelReport extends Report {

	public String hashMD5Result() {

		int hasCodeRresult = result.hashCode();

		return Integer.toString(hasCodeRresult);
	}

}
