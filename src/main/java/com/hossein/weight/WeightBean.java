package com.hossein.weight;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class WeightBean {

	private double lbsWeight;
	private double kgWeight;
	
	public WeightBean() {
		super();
	}

	public double getLbsWeight() {
		return lbsWeight;
	}

	public void setLbsWeight(double lbsWeight) {
		this.lbsWeight = lbsWeight;
	}

	public double getKgWeight() {
		return this.getLbsWeight() * 0.45359237;
	}

	public void setKgWeight(double kgWeight) {
		this.kgWeight = kgWeight;
	}
	
}
