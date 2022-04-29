import java.util.ArrayList;
// import java.util.LinkedList;

public class Substring {
	
	// substring(int, int) - Method in class java.lang.StringBuffer
	
	private String createSubstring;
	private String substring;
    private String RNASequence;
    private 
    private ArrayList<String> codons = new ArrayList<String>();
  

	public Substring (String RNASequence) {
    	this.RNASequence = RNASequence;
    }
	
    
	public ArrayList<String> createSubString(String RNAsequence) {     //scheint zu klappen, es werden jeweils 3-AA-Substrings gebildet :)
		for (int i=0; i<RNASequence.length(); i++) {
	    substring = RNASequence.substring(i,i+3);
		i = i+2;
		codons.add(substring);
		// System.out.println(codons);
		}
		
		return codons;
		}
	
	
    public ArrayList<String> getCodons() {
		return codons;
	}

	public void setCodons(ArrayList<String> codons) {
		this.codons = codons;
	}

	
	public String getCreateSubstring() {
		return createSubstring;
	}

	public void setCreateSubstring(String createSubstring) {
		this.createSubstring = createSubstring;
	}

	public String getSubstring() {
		return substring;
	}

	public void setSubstring(String substring) {
		this.substring = substring;
	}

	public String getRNASequence() {
		return RNASequence;
	}

	public void setRNASequence(String rNASequence) {
		RNASequence = rNASequence;
	}

}
