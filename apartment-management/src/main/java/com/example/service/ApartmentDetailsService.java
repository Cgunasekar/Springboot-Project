package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ApartmentDetails;
import com.example.repository.ApartmentDetailsRepository;

@Service
public class ApartmentDetailsService {
	@Autowired
	public ApartmentDetailsRepository repo;
	public List<ApartmentDetails> getDetails()
	{
		List<ApartmentDetails>details=new ArrayList<>();
		repo.findAll().forEach(detail->details.add(detail));
		return details;
	}
	public ApartmentDetails getDetails(String apartmentName)
	{
	return repo.findById(apartmentName).get();	
	}
	public void save(ApartmentDetails apartmentDetails)
	{
		repo.save(apartmentDetails);
	}
	public void update(String apartmentName,ApartmentDetails apartmentDetails)
	{
		repo.save(apartmentDetails);
	}
	public void delete(String apartmentName)
	{
		repo.deleteById(apartmentName);
	}
	}

