import java.util.ArrayList;

public class GlutamicAcid extends AminoAcids implements Translatable {
	
	    // protected Translatable nextInChain;
		// protected String singleLetterCode;
		// protected ProteinSequence aminoAcid;
		// protected String peptide;
		// protected int i;
		// protected int j;
	
	public GlutamicAcid (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}

	
	public Translatable setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	
		return nextInChain;
	}

	
	public String compareSub(ArrayList<String>codons, String peptide) {     
	
		if (i == codons.size()-1) {   
			    System.out.print(peptide.toString());   
		    }
		 
		  while( i < codons.size()-1) {  
		  if (codons.get(i).equals("GAA")) {
				singleLetterCode = "E";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }
		  
		  else if (codons.get(i).equals("GAG")) {
				singleLetterCode = "E";
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);     
			     return peptide; }  
		  
		  else {   
			  System.out.println("Dieses Codon war ungültig");      
			  System.exit(0) ;    // das hat gefehlt! :D
			 // return null;
			  
		 		  }
	 }
		  return peptide;
	  }
	

	
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}
}
