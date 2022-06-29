import java.util.ArrayList;
//import java.util.LinkedList;

public class Prolin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;

	public Prolin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
 	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestProl");  
			
		  if (codons.get(i).equals("CCA")) {
				singleLetterCode = "P";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testProl1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestProl1");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}
		  
		  else if (codons.get(i).equals("CCC")) {
				singleLetterCode = "P";
			     i+=1;
			     
			     //  System.out.print(singleLetterCode+"_testProl2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestProl2");	
			     
			     nextInChain.compareSub(codons, peptide);
			     
		  		}  
		  
		  else if (codons.get(i).equals("CCG")) {
				singleLetterCode = "P";
			     i+=1;
			
			     //  System.out.print(singleLetterCode+"_testProl3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestProl3");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}  
		  
		  else if (codons.get(i).equals("CCU")) {
				singleLetterCode = "P";
			     i+=1;
			  
			     System.out.print(singleLetterCode+"_testProl4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestProl4");	
			     
			     nextInChain.compareSub(codons, peptide);     
			     
		 }  
		  
		  else {        
				  System.out.println("testPrintProl");
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