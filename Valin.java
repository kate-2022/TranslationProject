import java.util.ArrayList;
// import java.util.LinkedList;

public class Valin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;

	public Valin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestVal");  
			  
			  if (codons.get(i).equals("GUA")) {
				singleLetterCode = "V";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Val1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestVal1");	
			     
			     nextInChain.compareSub(codons, peptide); 
			   		}
			  
			  else if (codons.get(i).equals("GUC")) {
				singleLetterCode = "V";
			     i+=1;
			     
			     // System.out.print(singleLetterCode+"_Val2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestVal2");	
			     
			     nextInChain.compareSub(codons, peptide);   
			  		}  
			  
			  else if (codons.get(i).equals("GUG")) {
				singleLetterCode = "V";
			     i+=1;
			     
			     // System.out.print(singleLetterCode+"_Val3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestVal3");	
			     
			     nextInChain.compareSub(codons, peptide);   
			 
				  	}  
				  
			  else if (codons.get(i).equals("GUU")) {
				singleLetterCode = "V";
			     i+=1;
		
			     System.out.print(singleLetterCode+"_Val4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestVal4");	
			     
			     nextInChain.compareSub(codons, peptide);    
			     
			     	}
	  
			  else {        
					  System.out.println("testPrintVal");
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
