import java.util.ArrayList;
//import java.util.LinkedList;

public class Isoleucin 	extends AminoAcids implements Translatable {
	 
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Isoleucin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestIsoleu");  
			  
		  if (codons.get(i).equals("AUA")) {
				singleLetterCode = "I";
			     i+=1;
			     		     
			     System.out.println(singleLetterCode+"_Isoleu1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestIsoleu1");	
			     
			     nextInChain.compareSub(codons, peptide);
		
		  		}
		  
		  else if (codons.get(i).equals("AUC")) {
				singleLetterCode = "I";
			     i+=1;
			     
			     //System.out.println(singleLetterCode+"_Isoleu2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestIsoleu2");	
			     
			     nextInChain.compareSub(codons, peptide);  
		  		}  
		  
		  else if (codons.get(i).equals("AUU")) {
				singleLetterCode = "I";
			     i+=1;
			
			     System.out.println(singleLetterCode+"_Isoleu3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestIsoleu3");	
			     
			     nextInChain.compareSub(codons, peptide);  		     
			     
			     } 
		  
		  else {        
				  System.out.println("testPrintIsoleu");
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
