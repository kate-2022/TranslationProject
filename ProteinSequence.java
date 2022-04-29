import java.util.ArrayList;
import java.util.LinkedList;


public class ProteinSequence { 
	
	private String proteinSequence;
	private String peptide;
    // private String aminoAcids;
	// private Translatable translation;
	


/*	public String proteinSequence(String singleLetterCode) {
		proteinSequence = proteinSequence + singleLetterCode;
		return proteinSequence;
	}*/
	
	
	public String proteinSequence(String peptide, String singleLetterCode) {
		peptide = peptide + singleLetterCode;
		return peptide;
	}

 
	@Override
	public String toString() {
    return "Die Aminosäre-Sequenz ist: " + proteinSequence ;
	}
	

	
	public String getPeptide() {
		return peptide;
	}


	public void setPeptide(String peptide) {
		this.peptide = peptide;
	}

	

	public String getSubstring(String substring) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProteinSequence() {
		return proteinSequence;
	}

	public void setProteinSequence(String proteinSequence) {
		this.proteinSequence = proteinSequence;
	}





}
