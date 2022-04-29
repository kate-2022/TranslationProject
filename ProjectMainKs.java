import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.Scanner;

public class ProjectMainKs {

	public static void main(String[] args)  {  // throws Exception {                // throws StackOverflowError {
	    
	    String source = "";
       // String singleLetterCode ="";
       // String substring;
	    String peptide =">";
        
        
        ArrayList<String> codons = new ArrayList<String>();
	   
	    //Objekte vom Typ Translatable (Klassen die das Interface implementieren) 
	    // zum Vergleich des substring mit den jeweiligen spezifischen Codons für jede AA (compareSub)
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
	 
	             // aa20 -> aa21 -> aa2 nicht weglassen, es geht ja in der Codon-Liste weiter mit dem nächsten Codon..
	             // MethioninSecond wird eingesetzt anstelle von Methionin für den zweiten und alle weiteren Durchlauf/Durchläufe 
	             // wegen dem pull.getCodon()-Befehl bei Methionin und i=0; (sonst startet der Index immer wieder bei 0)     
	            // dafür darf also auch nicht die Anweisung nextInChain.compareSub im else{}-Block zum Schluss wegfallen !!!
	    
		Scanner scan = new Scanner (System.in);
		System.out.println("Bitte geben Sie eine RNA-Sequenz ein. ");
        System.out.println("Die Sequenz muss aus den Nucleotiden A, U, G oder C bestehen und mit dem Startcodon AUG beginnen.");	
		
		source = scan.next();
		source = source.toUpperCase();
		
		if (!source.startsWith("AUG")){
	    System.out.println("Bitte erneut eingeben, die Sequenz muss mit dem Startcodon AUG beginnen.");	
	    source = scan.next();	
	    source = source.toUpperCase();
		}
		
		scan.close();
		
	    Substring sub = new Substring (source);  //Objekt vom Typ Substring
	    ProteinSequence prot1 = new ProteinSequence ();
	  //   AminoAcids AA = new AminoAcids();
		codons = sub.createSubString(source);

	    System.out.println("Die Substrings: " + codons);
	         
	 
	        peptide = prot1.getPeptide();
	        aa1.compareSub(codons, peptide);  
	    
             
	    
	   // System.out.print(peptide.toString());  
	                        // kein Zeilenumbruch, deshalb ohne ln !! ( die AA-Sequenz/ das Peptid soll kombiniert ausgegeben werden)

	}
}

