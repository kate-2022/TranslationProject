import java.util.ArrayList;
// import java.util.LinkedList;

public class Lysin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Lysin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestLys");  
			  
		  if (codons.get(i).equals("AAA")) {
				singleLetterCode = "K";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Lysin1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestLys1");	
			     
			     nextInChain.compareSub(codons, peptide);  
		  		}
		  
		  else if (codons.get(i).equals("AAG")) {
				singleLetterCode = "K";
			     i+=1;
			
			     System.out.println(singleLetterCode+"_Lysin2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
		         System.out.println("TestLys2");	
			     
			     nextInChain.compareSub(codons, peptide);    
		  		}  
		  
		  else {        
				  System.out.println("testPrintLys");
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
