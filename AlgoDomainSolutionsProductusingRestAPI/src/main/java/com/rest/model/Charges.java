package com.rest.model;


public class Charges {
	
	private double gst;
	private double deliveryCharge;
	public Charges() {
		super();
	}
	public Charges(double gst, double deliveryCharge) {
		super();
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	@Override
	public String toString() {
		return "Charges [gst=" + gst + ", deliveryCharge=" + deliveryCharge + "]";
	}
	

}
