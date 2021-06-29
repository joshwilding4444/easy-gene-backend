package com.easygene.util;

public class TranslatorTranscriber {
	public static GeneticCode defaultGeneticCode;
	
	static {
		defaultGeneticCode = new GeneticCode();
	}
	
	public static GeneticCode getDefaultGeneticCode() {
		return defaultGeneticCode;
	}
	
	public static void setDefaultGeneticCode(GeneticCode defaultGeneticCode) {
		TranslatorTranscriber.defaultGeneticCode = defaultGeneticCode;
	}
	
	/**
	 * Generates an amino acid sequence translated from input.
	 * 
	 * @param input RNA or DNA sequence data to translate into a series of amino acids.
	 * @param type Identifier for the sequence type. Either DNA or RNA.
	 * */
	public static String translateSequenceToAA(String input, String type) {
		StringBuilder outputSequenceData = new StringBuilder();
		for(int i = 0; i < input.length(); i += 3) {
			String codon = input.substring(i, i + 3);
			String newAminoAcid = defaultGeneticCode.getSingleCodonTranslation(codon, type);
			outputSequenceData.append(newAminoAcid);
		}
		return outputSequenceData.toString();
	}
	/**
	 * Generates an amino acid sequence translated from input, using an alternative genetic code.
	 * 
	 * @param input RNA or DNA sequence data to translate into a series of amino acids.
	 * @param type Identifier for the sequence type. Either DNA or RNA.
	 * @param customGenCode A mapping of codons to amino acids to use instead of the default.
	 * */
	public static String translateSequence(String input, String type, GeneticCode customGenCode) {
		StringBuilder outputSequenceData = new StringBuilder();
		for(int i = 0; i < input.length(); i += 3) {
			String codon = input.substring(i, i + 3);
			String newAminoAcid = customGenCode.getSingleCodonTranslation(codon, type);
			outputSequenceData.append(newAminoAcid);
		}
		return outputSequenceData.toString();
	}
	
	/**
	 * Transcribes a complementary RNA sequence based off of input.
	 * 
	 * @param input The base DNA sequence for the new RNA sequence.
	 * */
	public static String translateDNASequenceToRNA(String input) {
		StringBuilder outputSequenceData = new StringBuilder();
		for(char base : input.toCharArray()) {
			switch(base) {
			case 'A': 
				outputSequenceData.append('U');
				break;
			case 'T':
				outputSequenceData.append('A');
				break;
			case 'C':
				outputSequenceData.append('G');
				break;
			case 'G':
				outputSequenceData.append('C');
				break;
			}
		}
		return outputSequenceData.toString();
	}
}
