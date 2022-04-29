import java.util.ArrayList;
// import java.util.LinkedList;

public interface Translatable {
	
	  String compareSub(ArrayList<String> codons, String peptide);
	
	  Translatable setNextChain(Translatable nextInChain);
	
   // String proteinSequence(String peptide, String singleLetterCode);

	
	

}
