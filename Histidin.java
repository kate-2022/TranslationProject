import java.util.ArrayList;
// import java.util.LinkedList;

public class Histidin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Histidin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}

	
	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestHist");  
			  
		  if (codons.get(i).equals("CAC")) {
				singleLetterCode = "H";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Hist1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestHist1");	
			     
			     nextInChain.compareSub(codons, peptide);
			        
		  		}
		  
		  else if (codons.get(i).equals("CAU")) {
				singleLetterCode = "H";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Hist2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestHist2");	
			     
			     nextInChain.compareSub(codons, peptide);
		 
		  		}   
		  
		  else {        
				  System.out.println("testPrintHist");
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
