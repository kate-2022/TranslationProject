import java.util.ArrayList;

public class AminoAcids implements Translatable {
	
    protected Translatable nextInChain;
	protected String singleLetterCode;
	protected ProteinSequence aminoAcid = new ProteinSequence("");
	// protected String peptide;
	protected Substring pull = new Substring ("");  
	protected int i;
	protected int j;
    
	
	
    
	public String proteinSequence(String peptide, String singleLetterCode) {
		peptide = peptide + singleLetterCode;
		return peptide;
	
	}


 /*	public String getPeptide() {
		return peptide;
	}


	public void setPeptide(String peptide) {
		this.peptide = peptide;
	} */


	@Override
	public String compareSub(ArrayList<String> codons, String peptide) {
		return null;
	}


	@Override
	public Translatable setNextChain(Translatable nextInChain) {
		return null;
	}
    
    
    


}
