# TranslationProject
Translate any RNA sequence into the corresponding amino acid sequence. 
This works by processing an Array List (String) codons of generated 3-base substrings through a chain of responsibility of 20 classes. Here every one of the 20 essential amino acids has their own implementation of a compare substring() method containing 1 to 6 specific codons (variants of 3 bases). In case of match the corresponding single letter code is added to a growing peptide list and index i is increased by 1, then recursion unless i==(codons.size-1).
