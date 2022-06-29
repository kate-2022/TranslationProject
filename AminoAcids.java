import java.util.ArrayList;

public class AminoAcids implements Translatable {
	
	protected Translatable nextInChain;  /* just implements TranslInterface for beeing able
    to instantiate TranslInterface nextInChain !*/
	protected String singleLetterCode;
	// protected ProteinSequence aminoAcid;
	// protected ArrayList<String> codons;
	protected int i;



public String proteinSequence(String peptide, String singleLetterCode) {
peptide = peptide + singleLetterCode;
return peptide;

}



@Override
public void compareSub(ArrayList<String> codons, String peptide) {
	// TODO Auto-generated method stub
	
}



@Override
public void setNextChain(Translatable nextInChain) {
	// TODO Auto-generated method stub
	
}


}
