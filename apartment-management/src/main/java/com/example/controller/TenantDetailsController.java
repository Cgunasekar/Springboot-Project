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

import com.example.model.TenantDetails;
import com.example.service.TenantDetailsService;

@RestController
public class TenantDetailsController {
@Autowired
private TenantDetailsService service;
@GetMapping("/details")
private List<TenantDetails> getAllTenantDetails()
{
	return service.getAllTenantDetails();
}
@GetMapping("/details/{tenantName}")
private TenantDetails getTenantDetails(@PathVariable("tenantName")String tenantName)
{
 return service.getTenantDetails(tenantName);
 
}

@PostMapping("/details")
private String create(@RequestBody TenantDetails details)
{
	service.save(details);
	return details.getTenantName();
}
@PutMapping("/details/{tenantName}")
public void update(@PathVariable("tenantName") String tenantName,@RequestBody TenantDetails details)
{
	service.save(details);
}
@DeleteMapping("/details/{tenantName}")
public void delete(@PathVariable("tenantName") String tenantName)
{
	service.delete(tenantName);
}
}
