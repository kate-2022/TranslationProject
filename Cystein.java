import java.util.ArrayList;
// import java.util.LinkedList;

public class Cystein extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Cystein (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestCys");  
			  
		  if (codons.get(i).equals("UGC")) {
				singleLetterCode = "C";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Cys1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestCys1");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}
		  
		  else if (codons.get(i).equals("UGU")) {
				singleLetterCode = "C";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Cys2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestCys2");	
			     
			     nextInChain.compareSub(codons, peptide);
			     }  
		  
		  
		  else {        
			      System.out.println("testPrintCys");
				  nextInChain.compareSub(codons, peptide);

			  }
		  }
		
		  else {
			  System.out.println("peptide sequence: " + peptide);
			}
	  }

	
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}
}
