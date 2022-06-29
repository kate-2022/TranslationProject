import java.util.ArrayList;
//import java.util.LinkedList;

public class Glycin extends AminoAcids implements Translatable {
	
	 // all marked instances/variables inherited from AATest superclass !
    
	 //	protected TranslInterface nextInChain;
	 //	protected String singleLetterCode;
	 //	protected ProtTest aminoAcid;

	 //	protected int i;
	


	public Glycin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}
	

	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestGlyc");  		  
			  
		  if (codons.get(i).equals("GGA")) {
				singleLetterCode = "G";
			     i+=1;
			     
			     System.out.print(singleLetterCode+"_Glyc1");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlyc1");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}
		  
		  else if (codons.get(i).equals("GGC")) {
				singleLetterCode = "G";
			     i+=1;
			     
			     // System.out.print(singleLetterCode+"_Glyc2");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestGlyc2");	
			     
			     nextInChain.compareSub(codons, peptide);
		  		}
		  
		  else if (codons.get(i).equals("GGG")) {
				singleLetterCode = "G";
			     i+=1;
			     
			     // System.out.print(singleLetterCode+"_Glyc3");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestGlyc3");	
			     
			     nextInChain.compareSub(codons, peptide);
			     
			      }  
		  
		  else if (codons.get(i).equals("GGU")) {
				singleLetterCode = "G";
			     i+=1;
			    
			     System.out.print(singleLetterCode+"_Glyc4");
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestGlyc4");	
			     
			     nextInChain.compareSub(codons, peptide);
			     
			     
		  		}  
		  
		  else {        
				  System.out.println("testPrintGlyc");
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
