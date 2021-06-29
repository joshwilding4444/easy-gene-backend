package com.easygene.util;

import java.util.HashMap;

/*
 * Represents a genetic code. Most sequences will probably use a single common genetic code,
 * but alternative genetic codes exist for some organisms.
 * Sources:
 * 	https://www.britannica.com/science/genetic-code
 *  https://www.genome.gov/genetics-glossary/Genetic-Code
 *  http://genetics.bwh.harvard.edu/pph/FASTA.html
 * */
public class GeneticCode {
	String codeName;
	private HashMap<String, String> rnaTranslationTable;
	private HashMap<String, String> dnaTranslationTable;
	/*
	 * The noargs constructor will initialize using the common 
	 * genetic code as per this file's sources.
	 * */
	public GeneticCode() {
		super();
		this.getDefaultRNATranslationTable();
		this.getDefaultDNATranslationTable();
	}
	
	/*
	 * The following is a mapping table of the common 
	 * genetic code for RNA codons per the sources at the top of this file.
	 * Add a different mapping to the setTranslationTable(Hashmap translationTable)
	 * method to set to an alternate genetic code.
	 * */
	/**
	 * Initiates a default translation table for RNA codons.
	 * */
	private void getDefaultRNATranslationTable() {
		rnaTranslationTable = new HashMap<String, String>();
		rnaTranslationTable.put("UUU", "F");
		rnaTranslationTable.put("UUC", "F");
		rnaTranslationTable.put("UUA", "L");
		rnaTranslationTable.put("UUG", "L");
		rnaTranslationTable.put("CUU", "L");
		rnaTranslationTable.put("CUC", "L");
		rnaTranslationTable.put("CUA", "L");
		rnaTranslationTable.put("CUG", "L");
		rnaTranslationTable.put("UCU", "S");
		rnaTranslationTable.put("UCC", "S");
		rnaTranslationTable.put("UCA", "S");
		rnaTranslationTable.put("AGU", "S");
		rnaTranslationTable.put("UCG", "S");
		rnaTranslationTable.put("AGC", "S");
		rnaTranslationTable.put("CCU", "P");
		rnaTranslationTable.put("CCC", "P");
		rnaTranslationTable.put("CCA", "P");
		rnaTranslationTable.put("CCG", "P");
		rnaTranslationTable.put("AUU", "I");
		rnaTranslationTable.put("AUC", "I");
		rnaTranslationTable.put("AUA", "I");
		rnaTranslationTable.put("AUG", "M");
		rnaTranslationTable.put("ACU", "T");
		rnaTranslationTable.put("ACC", "T");
		rnaTranslationTable.put("ACA", "T");
		rnaTranslationTable.put("ACG", "T");
		rnaTranslationTable.put("GUU", "V");
		rnaTranslationTable.put("GUC", "V");
		rnaTranslationTable.put("GUA", "V");
		rnaTranslationTable.put("GUG", "V");
		rnaTranslationTable.put("GCU", "A");
		rnaTranslationTable.put("GCC", "A");
		rnaTranslationTable.put("GCA", "A");
		rnaTranslationTable.put("GCG", "A");
		rnaTranslationTable.put("UGU", "C");
		rnaTranslationTable.put("UGC", "C");
		rnaTranslationTable.put("UGG", "W");
		rnaTranslationTable.put("UAU", "Y");
		rnaTranslationTable.put("UAC", "Y");
		rnaTranslationTable.put("UAA", "*");
		rnaTranslationTable.put("UAG", "*");
		rnaTranslationTable.put("UGA", "*");
		rnaTranslationTable.put("CGU", "R");
		rnaTranslationTable.put("CGC", "R");
		rnaTranslationTable.put("CGA", "R");
		rnaTranslationTable.put("CCG", "R");
		rnaTranslationTable.put("AGA", "R");
		rnaTranslationTable.put("AGG", "R");
		rnaTranslationTable.put("CAU", "H");
		rnaTranslationTable.put("CAC", "H");
		rnaTranslationTable.put("CAA", "Q");
		rnaTranslationTable.put("CAG", "Q");
		rnaTranslationTable.put("AAU", "B");
		rnaTranslationTable.put("AAC", "B");
		rnaTranslationTable.put("AAA", "K");
		rnaTranslationTable.put("AAG", "K");
		rnaTranslationTable.put("GGU", "G");
		rnaTranslationTable.put("GGC", "G");
		rnaTranslationTable.put("GGA", "G");
		rnaTranslationTable.put("GGG", "G");
		rnaTranslationTable.put("GGG", "G");
		rnaTranslationTable.put("GAU", "D");
		rnaTranslationTable.put("GAC", "D");
		rnaTranslationTable.put("GAA", "E");
		rnaTranslationTable.put("GAG", "E");
	}
	
	/*
	 * The following is a mapping table of the common 
	 * genetic code for DNA codons per the sources at the top of this file.
	 * Add a different mapping to the setTranslationTable(Hashmap translationTable)
	 * method to set to an alternate genetic code.
	 * */
	/**
	 * Initiates a default translation table for DNA codons.
	 * */
	private void getDefaultDNATranslationTable() {
		dnaTranslationTable = new HashMap<String, String>();
		dnaTranslationTable.put("AAA", "F");
		dnaTranslationTable.put("AAG", "F");
		dnaTranslationTable.put("AAT", "L");
		dnaTranslationTable.put("AAC", "L");
		dnaTranslationTable.put("GAA", "L");
		dnaTranslationTable.put("GAG", "L");
		dnaTranslationTable.put("GAT", "L");
		dnaTranslationTable.put("GAC", "L");
		dnaTranslationTable.put("AGA", "S");
		dnaTranslationTable.put("AGG", "S");
		dnaTranslationTable.put("AGT", "S");
		dnaTranslationTable.put("AGC", "S");
		dnaTranslationTable.put("TCA", "S");
		dnaTranslationTable.put("TCG", "S");
		dnaTranslationTable.put("GGA", "P");
		dnaTranslationTable.put("GGG", "P");
		dnaTranslationTable.put("GGT", "P");
		dnaTranslationTable.put("GGC", "P");
		dnaTranslationTable.put("TAA", "I");
		dnaTranslationTable.put("TAG", "I");
		dnaTranslationTable.put("TAT", "I");
		dnaTranslationTable.put("TAC", "M");
		dnaTranslationTable.put("TGA", "T");
		dnaTranslationTable.put("TGG", "T");
		dnaTranslationTable.put("TGT", "T");
		dnaTranslationTable.put("TGC", "T");
		dnaTranslationTable.put("CAA", "V");
		dnaTranslationTable.put("CAG", "V");
		dnaTranslationTable.put("CAT", "V");
		dnaTranslationTable.put("CAC", "V");
		dnaTranslationTable.put("CGA", "A");
		dnaTranslationTable.put("CGG", "A");
		dnaTranslationTable.put("CGT", "A");
		dnaTranslationTable.put("CGC", "A");
		dnaTranslationTable.put("ACA", "C");
		dnaTranslationTable.put("ACG", "C");
		dnaTranslationTable.put("ACC", "W");
		dnaTranslationTable.put("ATA", "Y");
		dnaTranslationTable.put("ATG", "Y");
		dnaTranslationTable.put("ATT", "*");
		dnaTranslationTable.put("ATC", "*");
		dnaTranslationTable.put("ACT", "*");
		dnaTranslationTable.put("GCA", "R");
		dnaTranslationTable.put("GCG", "R");
		dnaTranslationTable.put("GCT", "R");
		dnaTranslationTable.put("GGC", "R");
		dnaTranslationTable.put("TCT", "R");
		dnaTranslationTable.put("TCC", "R");
		dnaTranslationTable.put("GTA", "H");
		dnaTranslationTable.put("GTG", "H");
		dnaTranslationTable.put("GTT", "Q");
		dnaTranslationTable.put("GTC", "Q");
		dnaTranslationTable.put("TTA", "B");
		dnaTranslationTable.put("TTG", "B");
		dnaTranslationTable.put("TTT", "K");
		dnaTranslationTable.put("TTC", "K");
		dnaTranslationTable.put("CCA", "G");
		dnaTranslationTable.put("CCG", "G");
		dnaTranslationTable.put("CCT", "G");
		dnaTranslationTable.put("CCC", "G");
		dnaTranslationTable.put("CTA", "D");
		dnaTranslationTable.put("CTG", "D");
		dnaTranslationTable.put("CTT", "E");
		dnaTranslationTable.put("CTC", "E");
	}
	
	/**
	 * Generates a single amino acid translation given a single codon 
	 * and nucleic acid sequence type.
	 * 
	 * @param codon String identifying a single nucleic acid triplet.
	 * @param type SequenceType flag identifying the specific type of target nucleic acid. 
	 * 			   The genetic code must know the type of nucleic acid to provide a correct
	 * 			   translation.
	 * */
	public String getSingleCodonTranslation(String codon, String type) {
		if(type.equals("RNA")) {
			return rnaTranslationTable.get(codon);
		} 
		else {
			return dnaTranslationTable.get(codon);
		}
	}
	
	@Override
	public String toString() {
		return "GeneticCode [codeName=" + codeName + ", translationTable=" + rnaTranslationTable + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeName == null) ? 0 : codeName.hashCode());
		result = prime * result + ((rnaTranslationTable == null) ? 0 : rnaTranslationTable.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneticCode other = (GeneticCode) obj;
		if (codeName == null) {
			if (other.codeName != null)
				return false;
		} else if (!codeName.equals(other.codeName))
			return false;
		if (rnaTranslationTable == null) {
			if (other.rnaTranslationTable != null)
				return false;
		} else if (!rnaTranslationTable.equals(other.rnaTranslationTable))
			return false;
		return true;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public HashMap<String, String> getTranslationTable() {
		return rnaTranslationTable;
	}

	public void setTranslationTable(HashMap<String, String> translationTable) {
		this.rnaTranslationTable = translationTable;
	}
}
