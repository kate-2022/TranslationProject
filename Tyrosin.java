import java.util.ArrayList;
// import java.util.LinkedList;

public class Tyrosin extends AminoAcids implements Translatable {
	
	     // all marked instances/variables inherited from AATest superclass !
    
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;

		 //	protected int i;
	
	public Tyrosin (String singleLetterCode ) {
		this.singleLetterCode = singleLetterCode;
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	

 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestTyro");  
			  
		  if (codons.get(i).equals("UAC")) {
				singleLetterCode = "Y";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Tyro1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestTyro1");	
			     
			     nextInChain.compareSub(codons, peptide);
}
		  
		  else if (codons.get(i).equals("UAU")) {
				singleLetterCode = "Y";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Tyro2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestTyro2");	
			     
			     nextInChain.compareSub(codons, peptide);  
		 }  
		  
		  else {        
				  System.out.println("testPrintTyro");
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
