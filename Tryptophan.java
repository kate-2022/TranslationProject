import java.util.ArrayList;
//import java.util.LinkedList;

public class Tryptophan extends AminoAcids implements Translatable {
	
	     // all marked instances/variables inherited from AATest superclass !
    
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;

		 //	protected int i;
	
	public Tryptophan (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;	
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}

	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestTrypto");  
			  
		  if (codons.get(i).equals("UGG")) {
				singleLetterCode = "W";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Trypto1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestCys1");	
			     
			     nextInChain.compareSub(codons, peptide);
			
			     }
		  
		  else {        
				  System.out.println("testPrintTrypto");
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
