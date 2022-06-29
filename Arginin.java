import java.util.ArrayList;
// import java.util.LinkedList;

public class Arginin extends AminoAcids implements Translatable {

         // all marked instances/variables inherited from AATest superclass !
          
		 //	protected TranslInterface nextInChain;
		 //	protected String singleLetterCode;
		 //	protected ProtTest aminoAcid;
    
         //	protected int i;
	
	public Arginin (String singleLetterCode) {
		this.singleLetterCode = singleLetterCode;
	}


	@Override
	public void setNextChain(Translatable nextChain) {
		this.nextInChain = nextChain;	

	}
	
	
   	@Override
	public void compareSub(ArrayList<String> codons, String peptide) {    
	    
		  if( i < codons.size()) {  
			  System.out.println(codons.get(i)+ " TestArg");  
			  
		  if (codons.get(i).equals("AGA")) {
				singleLetterCode = "R";
			     i+=1;
			     
			     System.out.println(singleLetterCode+"_Arg1");	
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestArg1");	
			     
			     nextInChain.compareSub(codons, peptide);
			 	}
		  
		  else if (codons.get(i).equals("AGG")) {
				singleLetterCode = "R";
			     i+=1;

			     //System.out.println(singleLetterCode+"_Arg2");
			     
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestArg2");	
			     nextInChain.compareSub(codons, peptide);   
			     
		  		}  
		  
		  else if (codons.get(i).equals("CGA")) {
				singleLetterCode = "R";
			     i+=1;
			     //System.out.println(singleLetterCode+"_Arg3");
			     
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestArg3");	
			     nextInChain.compareSub(codons, peptide);   
			   
			   }  
		  
		  else if (codons.get(i).equals("CGC")){
				singleLetterCode = "R";		    
			     i+=1;
			     //System.out.println(singleLetterCode+"_Arg4");
			     
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestArg4");	
			     nextInChain.compareSub(codons, peptide);  
			    }  
		  
		  else if (codons.get(i).equals("CGG")) {
				singleLetterCode = "R";
			     i+=1;
			     //System.out.println(singleLetterCode+"_Arg5");
			     
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			//     System.out.println("TestArg5");	
			     nextInChain.compareSub(codons, peptide);  
			      
		  		}  
		  
		  else if (codons.get(i).equals("CGU")) {
				singleLetterCode = "R";
			     i+=1;
			     System.out.println(singleLetterCode+"_Arg5");
			     
			     peptide = peptide + singleLetterCode;
			     codons.remove(0);
			     System.out.println("TestArg5");	
			     nextInChain.compareSub(codons, peptide);    
			     
		  		}  
		  else {        
			  System.out.println("testPrintArg");
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
