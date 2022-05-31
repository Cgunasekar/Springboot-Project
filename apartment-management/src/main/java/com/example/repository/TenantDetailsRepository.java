package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.TenantDetails;

public interface TenantDetailsRepository  extends JpaRepository <TenantDetails,String> {

}