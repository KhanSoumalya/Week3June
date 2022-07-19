package com.nit.entity;
import java.util.*;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Document(collection = "tutorials")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Debanjan {
	@Id
	public int geo_id;
    public String name;
    public ArrayList<Sd> sd;

}
