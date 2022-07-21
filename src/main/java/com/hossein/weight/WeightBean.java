package com.hossein.weight;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class WeightBean {

	private int weight;

	public WeightBean() {
		super();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
