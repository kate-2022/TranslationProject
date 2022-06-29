import java.util.ArrayList;

public class GlutamicAcid extends AminoAcids implements Translatable {
	
	         // all marked instances/variables inherited from AATest superclass !
    
			 //	protected TranslInterface nextInChain;
			 //	protected String singleLetterCode;
			 //	protected ProtTest aminoAcid;
		  
	         //	protected int i;
			
	
	public GlutamicAcid (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}

	
	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	
	}

	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {       
			
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestGlucAc");  
			  
		  if (codons.get(i).equals("GAA")) {
				singleLetterCode = "E";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_GlutAc1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlucAc1");	
			     nextInChain.compareSub(codons, peptide);
				     }
		  
		  else if (codons.get(i).equals("GAG")) {
				singleLetterCode = "E";
			     i+=1;
			     
		         System.out.println(singleLetterCode+"_GlutAc2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
		         System.out.println("TestGlucAc2");	
			     nextInChain.compareSub(codons, peptide);   
			     }  
		  
		/*  else {   
			  System.out.println("Dieses Codon war ung�ltig! Bitte �berpr�fen Sie Ihre Eingabe.");      
			  System.exit(0) ;   	 
			  
		 		}*/
		  
		    else {        
				  System.out.println("testPrintGlutAc");
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
