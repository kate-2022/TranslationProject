import java.util.ArrayList;
// import java.util.LinkedList;

public class Glutamin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;

	public Glutamin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestGlut");  
			  
		  if (codons.get(i).equals("CAA")) {
				singleLetterCode = "Q";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Glut1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlut1");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}   
		  
		  else if (codons.get(i).equals("CAG")) {
				singleLetterCode = "Q";
			     i+=1;	
			     
			     System.out.println(singleLetterCode+"_Glut2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlut2");	
			     
			     nextInChain.compareSub(codons, peptide);
			  	}  
	
		  else {        
				  System.out.println("testPrintGlut");
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
