package com.revature.model;

public class ReimbursementType {

	int RT_ID;
	String RT_Type;

	public int getRT_ID() {
		return RT_ID;
	}

	public void setRT_ID(int rT_ID) {
		RT_ID = rT_ID;
	}

	public String getRT_Type() {
		return RT_Type;
	}

	public void setRT_Type(String rT_Type) {
		RT_Type = rT_Type;
	}


	@Override
	public String toString() {
		return "ReimbursementType [RT_ID=" + RT_ID + ", RT_Type=" + RT_Type + "]";
	}

}
