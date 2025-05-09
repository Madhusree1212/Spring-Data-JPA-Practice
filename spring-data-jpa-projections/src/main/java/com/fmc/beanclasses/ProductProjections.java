package com.fmc.beanclasses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductProjections {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer prodId;
	@Column
	private Double prodCost;
	@Column
	private String vendorCode;

}
