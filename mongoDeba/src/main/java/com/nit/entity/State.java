package com.nit.entity;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
	
	public String name;
    public int parent_id;
    public int state_id;
    public ArrayList<District> district;

}
