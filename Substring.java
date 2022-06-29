import java.util.ArrayList;

public class Substring {
	
	private String substring;
    private String RNASequence;
    private ArrayList<String> codonsSub = new ArrayList<String>();
    
    Translatable aa1 = new Methionin("M");        
    Translatable aa2 = new Alanin("A");  
    Translatable aa3 = new Valin("V");
    Translatable aa4 = new Leucin("L");
    Translatable aa5 = new Isoleucin("I");
    Translatable aa6 = new Glycin("G");
    Translatable aa7 = new Prolin("P");
    Translatable aa8 = new Phenylalanin("F");
    Translatable aa9 = new Tryptophan("W");
    Translatable aa10 = new Serin("S");
    Translatable aa11 = new Threonin("T");
    Translatable aa12 = new Asparagin("N");
    Translatable aa13 = new Glutamin("Q");
    Translatable aa14 = new Tyrosin("Y");
    Translatable aa15 = new Cystein("C");
    Translatable aa16 = new Lysin("K");
    Translatable aa17 = new Arginin("R");
    Translatable aa18 = new Histidin("H");
    Translatable aa19 = new AsparagicAcid("D");
    Translatable aa20 = new GlutamicAcid ("E"); 
   

	public Substring (String RNASequence) {
    	this.RNASequence = RNASequence;
    	 aa1.setNextChain(aa2); 
    	 aa2.setNextChain(aa3);
 	     aa3.setNextChain(aa4);
 	     aa4.setNextChain(aa5);
 	     aa5.setNextChain(aa6);
 	     aa6.setNextChain(aa7);
 	     aa7.setNextChain(aa8);
 	     aa8.setNextChain(aa9);
 	     aa9.setNextChain(aa10);
 	     aa10.setNextChain(aa11);
 	     aa11.setNextChain(aa12);
 	     aa12.setNextChain(aa13);
 	     aa13.setNextChain(aa14);
 	     aa14.setNextChain(aa15);
 	     aa15.setNextChain(aa16);
 	     aa16.setNextChain(aa17);
 	     aa17.setNextChain(aa18);
 	     aa18.setNextChain(aa19);
 	     aa19.setNextChain(aa20);  
		 aa20.setNextChain(aa2);   
    }
	
    
	public ArrayList<String> createSubString(String RNAsequence) {     //es werden jeweils 3-Basen-Substrings gebildet :)
		for (int i=0; i<RNASequence.length(); i++) {
	    substring = RNASequence.substring(i,i+3);
		i = i+2;
		codonsSub.add(substring);
	//	System.out.println(codonsSub + " SubTest");
		}
		System.out.println("RNA substrings: " + codonsSub);
	
		aa1.compareSub(codonsSub, "> ");
		return codonsSub;
		}
	
	
    public ArrayList<String> getCodonsSub() {
		return codonsSub;
	}


	public void setCodonsSub(ArrayList<String> codonsSub) {
		this.codonsSub = codonsSub;
	}



	public String getRNASequence() {
		return RNASequence;
	}

	public void setRNASequence(String rNASequence) {
		RNASequence = rNASequence;
	}


}
