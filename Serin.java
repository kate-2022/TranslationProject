import java.util.ArrayList;
// import java.util.LinkedList;

public class Serin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	
	public Serin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}

	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestSer");  
			  
		  if (codons.get(i).equals("AGC")) {
				singleLetterCode = "S";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testSerin1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestCys1");	
			     
			     nextInChain.compareSub(codons, peptide);
 }
		  
		  else if (codons.get(i).equals("AGU")) {
				singleLetterCode = "S";
			     i+=1;
			     
				 //  System.out.print(singleLetterCode+"_testSerin2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestCys2");	
			     
			     nextInChain.compareSub(codons, peptide); 
 
		  		}  
		  
		  else if (codons.get(i).equals("UCA")) {
				singleLetterCode = "S";
			     i+=1;

			     //  System.out.print(singleLetterCode+"_testSerin3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestCys3");	
			     
			     nextInChain.compareSub(codons, peptide); 
			     
		  		}  
		  
		  else if (codons.get(i).equals("UCC")) {
				singleLetterCode = "S";
			     i+=1;
			     
			     //  System.out.print(singleLetterCode+"_testSerin4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestCys4");	
			     
			     nextInChain.compareSub(codons, peptide);  
		  		}  
		  
		  else if (codons.get(i).equals("UCG")) {
				singleLetterCode = "S";
			     i+=1;
			     
			     //  System.out.print(singleLetterCode+"_testSerin5");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestCys5");	
			     
			     nextInChain.compareSub(codons, peptide);   
		  		}  
		  
		  else if (codons.get(i).equals("UCU")) {
				singleLetterCode = "S";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_testSerin6");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestCys6");	
			     
			     nextInChain.compareSub(codons, peptide);    
		  		}  
		  
		  else {        
				  System.out.println("testPrintSer");
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
