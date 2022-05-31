package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ApartmentDetails;
import com.example.service.ApartmentDetailsService;

@RestController
public class ApartmentDetailsController {
@Autowired
private ApartmentDetailsService service;
@GetMapping("/Details")
private List<ApartmentDetails> getAllDetails()
{
	return service.getDetails();
}
@GetMapping("/Details/{apartmentName}")
private ApartmentDetails getExamDetails(@PathVariable ("apartmentName")String apartmantName)
{
	return service.getDetails(apartmantName);
	
}
@PostMapping("/Details")
private String create(@RequestBody ApartmentDetails apartmentDetails)
{
	service.save(apartmentDetails);
	return apartmentDetails.getApartmentName();
}
@PutMapping("/Details/{apartmentName}")
private void update(@PathVariable ("apartmentName") String apartmentName,@RequestBody ApartmentDetails apartmentDetails)
{
service.save(apartmentDetails);	
}
@DeleteMapping("/Details/{apartmentName}")
private void delete(@PathVariable ("apartmentName")String apartmentName )
{
	service.delete(apartmentName);
}
}

