import java.util.ArrayList;
//import java.util.LinkedList;

public class Threonin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Threonin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;	
	}
	
	
	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}

 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestThreo");  
			  
		  if (codons.get(i).equals("ACA")) {
				singleLetterCode = "T";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testThreonin1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestThreonin1");	
			     
			     nextInChain.compareSub(codons, peptide); 
		   
		  		}
		  
		  else if (codons.get(i).equals("ACC")) {
				singleLetterCode = "T";
			     i+=1;
			     
			   //  System.out.print(singleLetterCode+"_testThreonin2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			   //  System.out.println("TestThreonin2");	
			     
			     nextInChain.compareSub(codons, peptide);    
			   } 
		  
		  else if (codons.get(i).equals("ACG")) {
				singleLetterCode = "T";
			     i+=1;
			     
			   //  System.out.print(singleLetterCode+"_testThreonin3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			   //  System.out.println("TestThreonin3");	
			     
			     nextInChain.compareSub(codons, peptide);     
		  		}  
		  
		  else if (codons.get(i).equals("ACU")) {
				singleLetterCode = "T";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testThreonin4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestThreonin4");	
			     
			     nextInChain.compareSub(codons, peptide);   
		  }
		  
			     else {        
						  System.out.println("testPrintThreo");
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
