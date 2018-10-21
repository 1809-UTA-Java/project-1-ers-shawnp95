package com.revature.model;

import oracle.sql.BLOB;
import oracle.sql.TIMESTAMP;

public class Reimbursement {

	int R_ID;
	int R_Amount;
	String R_Description;
	BLOB R_Receipt;
	TIMESTAMP R_Submitted;
	TIMESTAMP R_Resolved;
	int U_ID_Author;
	int U_ID_Resolver;
	int RT_Type;
	int RT_Status;

	public int getR_ID() {
		return R_ID;
	}

	public void setR_ID(int r_ID) {
		R_ID = r_ID;
	}

	public int getR_Amount() {
		return R_Amount;
	}

	public void setR_Amount(int r_Amount) {
		R_Amount = r_Amount;
	}

	public String getR_Description() {
		return R_Description;
	}

	public void setR_Description(String r_Description) {
		R_Description = r_Description;
	}

	public BLOB getR_Receipt() {
		return R_Receipt;
	}

	public void setR_Receipt(BLOB r_Receipt) {
		R_Receipt = r_Receipt;
	}

	public TIMESTAMP getR_Submitted() {
		return R_Submitted;
	}

	public void setR_Submitted(TIMESTAMP r_Submitted) {
		R_Submitted = r_Submitted;
	}

	public TIMESTAMP getR_Resolved() {
		return R_Resolved;
	}

	public void setR_Resolved(TIMESTAMP r_Resolved) {
		R_Resolved = r_Resolved;
	}

	public int getU_ID_Author() {
		return U_ID_Author;
	}

	public void setU_ID_Author(int u_ID_Author) {
		U_ID_Author = u_ID_Author;
	}

	public int getU_ID_Resolver() {
		return U_ID_Resolver;
	}

	public void setU_ID_Resolver(int u_ID_Resolver) {
		U_ID_Resolver = u_ID_Resolver;
	}

	public int getRT_Type() {
		return RT_Type;
	}

	public void setRT_Type(int rT_Type) {
		RT_Type = rT_Type;
	}

	public int getRT_Status() {
		return RT_Status;
	}

	public void setRT_Status(int rT_Status) {
		RT_Status = rT_Status;
	}



	@Override
	public String toString() {
		return "Reimbursement [R_ID=" + R_ID + ", R_Amount=" + R_Amount + ", R_Description=" + R_Description
				+ ", R_Receipt=" + R_Receipt + ", R_Submitted=" + R_Submitted + ", R_Resolved=" + R_Resolved
				+ ", U_ID_Author=" + U_ID_Author + ", U_ID_Resolver=" + U_ID_Resolver + ", RT_Type=" + RT_Type
				+ ", RT_Status=" + RT_Status + "]";
	}

}
