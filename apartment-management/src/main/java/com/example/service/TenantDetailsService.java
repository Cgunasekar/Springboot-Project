package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.TenantDetails;
import com.example.repository.TenantDetailsRepository;

@Service
public class TenantDetailsService {
	@Autowired
	public TenantDetailsRepository repo;
	public List<TenantDetails> getAllTenantDetails()
	{
		List<TenantDetails>details=new ArrayList<>();
		repo.findAll().forEach(details1->details.add(details1));
		return details;
	}
	public TenantDetails getTenantDetails(String tenantName)
	{
		return repo.findById(tenantName).get();
	}
	public void save(TenantDetails details)
	{
		repo.save(details);
		
	}
	public void update(String tenantName,TenantDetails details)
	{
		repo.save(details);
	}
	public void delete(String tenantName)
	{
		repo.deleteById(tenantName);
	}
	
	}
