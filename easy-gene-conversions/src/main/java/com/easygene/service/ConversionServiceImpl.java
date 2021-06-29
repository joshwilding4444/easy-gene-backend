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
	public String convert(String input, String username, String type, String flag) {
		String result = "";
		if(flag.equals("TRANSCRIBE")) {
			result = ConversionService.transcribe(input);
		} else if(flag.equals("TRANSLATE")) {
			result = ConversionService.translate(input, type);
		}
		return result;
	}

	@Override
	public ConversionDTO saveResult(ConversionDTO input) {
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
