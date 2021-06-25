package com.easygene.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.easygene.dto.ConversionDTO;

@Service
public interface ConversionService {
	public static String transcribe(String input) {
		return "";
	}
	
	public static String translate(String input) {
		return "";
	}
	
	public String convert(String input, String username, String flag);
	public ConversionDTO saveResult(ConversionDTO input);
	public List<ConversionDTO> findByUsername(String username);
}
