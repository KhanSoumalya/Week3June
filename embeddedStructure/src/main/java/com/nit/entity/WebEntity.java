package com.nit.entity;

import javax.persistence.AttributeOverride;
import java.util.*;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebEntity {
	
	@Id
	@Column(name="identity")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Embedded
	private Person details;
	
	@Embedded
    @AttributeOverrides(value = {
      @AttributeOverride(name = "street", column = @Column(name = "streetAddr")),
      @AttributeOverride(name = "pincode", column = @Column(name = "postcode"))
    })
    private Address address;

}
