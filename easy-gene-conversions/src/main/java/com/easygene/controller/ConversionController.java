package com.easygene.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.easygene.dto.ConversionDTO;
import com.easygene.service.ConversionService;

@Controller
public class ConversionController {
	@Autowired
	private ConversionService conversionService;
	
	@CrossOrigin
	@PostMapping(path = "/convert")
	public ResponseEntity<ConversionDTO> convertSequence(@RequestBody ConversionDTO input) {
		String resultString = conversionService.convert(input.getOriginalSequence(), input.getUsername(), 
				input.getOriginalSequenceType(), input.getConversionType());
		input.setResultSequence(resultString);
		ConversionDTO res = conversionService.saveResult(input);
		return new ResponseEntity<ConversionDTO>(res, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping(path = "/conversions/{username}")
	public ResponseEntity<List<ConversionDTO>> findByUsername(@PathVariable String username) {
		List<ConversionDTO> res = conversionService.findByUsername(username);
		return new ResponseEntity<List<ConversionDTO>>(res, HttpStatus.OK);
	}
}
