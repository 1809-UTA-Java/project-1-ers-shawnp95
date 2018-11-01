package com.revature.model;

public class ReimbursementStatus {

	int RS_ID;
	String RS_Status;

	public int getRS_ID() {
		return RS_ID;
	}

	public void setRS_ID(int rS_ID) {
		RS_ID = rS_ID;
	}

	public String getRS_Status() {
		return RS_Status;
	}

	public void setRS_Status(String rS_Status) {
		RS_Status = rS_Status;
	}



	@Override
	public String toString() {
		return "ReimbursementStatus [RS_ID=" + RS_ID + ", RS_Status=" + RS_Status + "]";
	}

}
