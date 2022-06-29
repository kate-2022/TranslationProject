import java.util.ArrayList;
// import java.util.LinkedList;

public class Leucin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Leucin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestLeuc");  
			  
		  if (codons.get(i).equals("UUA")) {
				singleLetterCode = "L";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testLeucin1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestLeuc1");	
			     
			     nextInChain.compareSub(codons, peptide);
 }
		  
		  else if (codons.get(i).equals("UUG")) {
				singleLetterCode = "L";
			     i+=1;
			     
			  //   System.out.print(singleLetterCode+"_testLeucin2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			  //   System.out.println("TestLeuc2");	
			     
			     nextInChain.compareSub(codons, peptide); 
			     
 }  
		  
		  else if (codons.get(i).equals("CUA")) {
				singleLetterCode = "L";
			     i+=1;
			     
			  //   System.out.print(singleLetterCode+"_testLeucin3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			  //   System.out.println("TestLeuc3");	
			     
			     nextInChain.compareSub(codons, peptide); 
			     
} 
		  
		  else if (codons.get(i).equals("CUC")) {
				singleLetterCode = "L";
			     i+=1;
			   
			   //  System.out.print(singleLetterCode+"_testLeucin4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			   //  System.out.println("TestLeuc4");	
			     
			     nextInChain.compareSub(codons, peptide); 
		     
			  } 
		  
		  else if (codons.get(i).equals("CUG")) {
				singleLetterCode = "L";
			     i+=1;
			
			   //  System.out.print(singleLetterCode+"_testLeucin5");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			   //  System.out.println("TestLeuc5");	
			     
			     nextInChain.compareSub(codons, peptide);   
			     
			  }  
		  
		  else if (codons.get(i).equals("CUU")) {
				singleLetterCode = "L";
			     i+=1;
			 
			     System.out.print(singleLetterCode+"_testLeucin6");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestLeuc6");	
			     
			     nextInChain.compareSub(codons, peptide);     
			     
			  }  
		  
		  else {        
			  	System.out.println("testPrintLeuc");
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
