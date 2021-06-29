package com.easygene.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.easygene.dto.ConversionDTO;
import com.easygene.util.TranslatorTranscriber;

@Service
public interface ConversionService {
	
	public static String transcribe(String input) {
		return TranslatorTranscriber.translateDNASequenceToRNA(input);
	}
	
	public static String translate(String input, String type) {
		return TranslatorTranscriber.translateSequenceToAA(input, type);
	}
	
	public String convert(String input, String username, String type, String flag);
	public ConversionDTO saveResult(ConversionDTO input);
	public List<ConversionDTO> findByUsername(String username);
}
