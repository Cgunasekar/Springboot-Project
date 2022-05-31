package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ApartmentDetails;

public interface ApartmentDetailsRepository extends JpaRepository <ApartmentDetails,String> {

}
