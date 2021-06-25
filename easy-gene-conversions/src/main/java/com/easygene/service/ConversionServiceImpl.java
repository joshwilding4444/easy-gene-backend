package com.easygene.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easygene.dto.ConversionDTO;
import com.easygene.entity.Conversion;
import com.easygene.repository.ConversionRepository;
@Service
public class ConversionServiceImpl implements ConversionService {

	@Autowired
	private ConversionRepository conversionRepo;
	
	@Override
	public String convert(String input, String username, String flag) {
		String result = "";
		if(flag == "TRANSCRIBE") {
			result = ConversionService.transcribe(input);
		} else {
			result = ConversionService.translate(input);
		}
		return result;
	}

	@Override
	public ConversionDTO saveResult(ConversionDTO input) {
		String resultString = convert(input.getOriginalSequence(), input.getUsername(), input.getConversionType());
		input.setResultSequence(resultString);
		Conversion writtenResult = conversionRepo.save(input.getEntity());
		return ConversionDTO.prepareDTO(writtenResult);
	}

	@Override
	public List<ConversionDTO> findByUsername(String username) {
		List<Conversion> rawList = conversionRepo.findByUsername(username);
		List<ConversionDTO> processedList = new ArrayList<>();
		for(Conversion c : rawList) {
			processedList.add(ConversionDTO.prepareDTO(c));
		}
		return processedList;
	}
}
