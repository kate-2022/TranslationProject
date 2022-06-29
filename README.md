# TranslationProject
Translates any RNA sequence into the corresponding amino acid sequence (peptide/ protein). 
This works by processing an Array List (String) of generated 3-base substrings through a chain of responsibility of 20 amino acid classes. Here every one of the amino acids has their own implementation of a compare substring() method containing 1 to 6 specific codons (variants of 3 bases). In case of a match the corresponding single letter code is added to a growing peptide list and index i is increased by 1, then recursion unless i==(codons.size-1).

(This is an ongoing project.. some details still need to be fixed! :D)
