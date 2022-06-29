import java.util.ArrayList;

public class ProteinSequence { 
	
	private String peptide;
	private ArrayList<String> codonsRNA;


	public ProteinSequence (ArrayList<String> codons, String peptide) {
		this.codonsRNA = codons;
		this.peptide = peptide;
	}


	public String getPeptide() {
		return peptide;
	}

	public void setPeptide(String peptide) {
		this.peptide = peptide;
	}

	public ArrayList<String> getCodonsRNA() {
		return codonsRNA;
	}

	public void setCodonsRNA(ArrayList<String> codonsRNA) {
		this.codonsRNA = codonsRNA;
	}
}
