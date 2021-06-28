package com.easygene;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.easygene.util.TranslatorTranscriber;

@SpringBootTest
public class TranslatorTranscriberTests {
	@Test
	public void TranscribesDNAToRNA() {
		String testDNASequence = "TACACCGGGAGTATT";
		String expectedRNAOutput = "AUGUGGCCCUCAUAA";
		String actualOutput = TranslatorTranscriber.translateDNASequenceToRNA(testDNASequence);
		Assertions.assertEquals(expectedRNAOutput, actualOutput);
	}
	
	@Test
	public void TranslatesRNAToAA() {
		String testRNASequence = "AUGUGGCCCUCAUAA";
		String expectedAAOutput = "MWPS*";
		String actualOutput = TranslatorTranscriber.translateSequence(testRNASequence, "RNA");
		Assertions.assertEquals(expectedAAOutput, actualOutput);
	}
	
	@Test
	public void TranslatesDNAToAA() {
		String testDNASequence = "TACACCGGGAGTATT";
		String expectedAAOutput = "MWPS*";
		String actualOutput = TranslatorTranscriber.translateSequence(testDNASequence, "DNA");
		Assertions.assertEquals(expectedAAOutput, actualOutput);
	}
}
