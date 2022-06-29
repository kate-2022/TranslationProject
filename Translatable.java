import java.util.ArrayList;

public interface Translatable {
	
	    void compareSub(ArrayList<String> codons, String peptide);  
	    void setNextChain(Translatable nextInChain);
	


}
