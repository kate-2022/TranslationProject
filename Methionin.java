import java.awt.event.ActionEvent;
import java.util.ArrayList;
// import java.util.LinkedList;

public class Methionin extends AminoAcids implements Translatable {
	
      // protected Translatable nextInChain;
	  // protected String singleLetterCode;
	  // protected ProteinSequence aminoAcid;
	     private String peptide = ">";
	     protected int i=0;
	  // protected int j;
    
      // protected Substring pull;  


	
	// Konstruktor
	public Methionin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}

	public Translatable setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	
		return nextInChain;
	}
	                                                                                      // toString()-Methode anpassen!! s.u.
	
	public String compareSub(ArrayList<String>codons, String peptide) {                   // throws StackOverflowError{ 
	  pull.getCodons();
	  
	  if (i == codons.size()-1) {    // für alle AS anpassen!!!
		    System.out.print(peptide.toString());   
	  }
	  while( i < codons.size()-1) {  // size-1 für alle AS anpassen!!!
		  if (codons.get(i).equals("AUG")) {                                
			     singleLetterCode = "M";                       
			     proteinSequence(peptide, singleLetterCode);
			     i+=1;
			     compareSub(codons, peptide);  			    
			     return peptide; }		
          // singleLetterCode auffangen in String-Variable peptide und mit weitergeben in der Chain of responsibility - als zweites Argument/Parameter 
		                                        //  zweiten Index [j] verwenden
 		  else {                                        
 			  nextInChain.compareSub(codons, peptide);
		
 		  }
	 }
		  return peptide;
	  }
	

	@Override
    public String toString() {                        // das hier noch überprüfen und bei allen AS Klassen anpassen!!
		peptide = peptide + singleLetterCode;
		return peptide;
    }
     
     public String getSingleLetterCode() {
 		return singleLetterCode;
 	}

     
    @ Override
	public String proteinSequence(String peptide, String singleLetterCode) {
		peptide = peptide + singleLetterCode;
		return peptide;
	
	}
}
