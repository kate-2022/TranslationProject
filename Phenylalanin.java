import java.util.ArrayList;
//import java.util.LinkedList;

public class Phenylalanin extends AminoAcids implements Translatable {
	 
		 // all marked instances/variables inherited from AATest superclass !
    
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;

		 //	protected int i;

	public Phenylalanin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	

	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestPhenyl");  
			  
			  
		  if (codons.get(i).equals("UUC")) {
				singleLetterCode = "F";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Phenyl1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestPhenyl1");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}
		  
		  else if (codons.get(i).equals("UUU")) {
				singleLetterCode = "F";
			     i+=1;
			    
			     System.out.print(singleLetterCode+"_Phenyl1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
		         System.out.println("TestPhenyl1");	
			     
			     nextInChain.compareSub(codons, peptide);
				}  
		  
		  else {        
				  System.out.println("testPrintPhenyl1");
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
