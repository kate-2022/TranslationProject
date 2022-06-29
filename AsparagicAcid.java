import java.util.ArrayList;
// import java.util.LinkedList;

public class AsparagicAcid extends AminoAcids implements Translatable {
	 
         // all marked instances/variables inherited from AATest superclass !
         
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
   
         //	protected int i;
	
	public AsparagicAcid (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	
	
	}
	
	
	
   	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestAspAc");  
			  
		  if (codons.get(i).equals("GAC")) {
				singleLetterCode = "D";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_AspAc1");	
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestAspAc1");	
			     
			     nextInChain.compareSub(codons, peptide);  
			    
			     }
		  
		  else if (codons.get(i).equals("GAU")) {
				singleLetterCode = "D";
			     i+=1;
			     
			 	//     System.out.print(singleLetterCode+"_AspAc2");	
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestAspAc2");	
			     
			     nextInChain.compareSub(codons, peptide);  
	     
		  		}  
		  
		  else {                                        
			  System.out.println("testPrintAspAc");
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
