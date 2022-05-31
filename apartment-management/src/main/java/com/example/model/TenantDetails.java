package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TenantDetails {
@Column(name="DoorNo")
private int doorNo;
@Id
@Column(name="Tenant Name")
private String tenantName;
@Column(name="No Of Family Members")
private int members;
@Column(name="Years Of Agreement")
private int years;
}
