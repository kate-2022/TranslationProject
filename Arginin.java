import java.util.ArrayList;
// import java.util.LinkedList;

public class Arginin extends AminoAcids implements Translatable {
	
	    // protected Translatable nextInChain;
		// protected String singleLetterCode;
		// protected ProteinSequence aminoAcid;
		// protected String peptide;
		// protected int i;
		// protected int j;
	
	
	public Arginin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}


	public Translatable setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	
		return nextInChain;
	}
	
	
	public String compareSub(ArrayList<String>codons, String peptide){		
		 if (i == codons.size()) {   
			    System.out.print(peptide.toString());   
		    }
		 
		  while( i <= codons.size()-1) {   
		  if (codons.get(i).equals("AGA")) {
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }
		  
		  else if (codons.get(i).equals("AGG")) {
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else if (codons.get(i).equals("CGA")) {
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else if (codons.get(i).equals("CGC")){
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else if (codons.get(i).equals("CGG")) {
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else if (codons.get(i).equals("CGU")) {
				singleLetterCode = "R";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else {                                        
				
 			  nextInChain.compareSub(codons, peptide);		
 		   }
 	    }
		  return peptide;
		  }
		   
	  
	
	
	

     
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}
}
