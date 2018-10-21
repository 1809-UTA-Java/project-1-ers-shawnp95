package com.revature.model;

public class UserRole {

	int UR_ID;
	String UR_Role;

	public int getUR_ID() {
		return UR_ID;
	}

	public void setUR_ID(int uR_ID) {
		UR_ID = uR_ID;
	}

	public String getUR_Role() {
		return UR_Role;
	}

	public void setUR_Role(String uR_Role) {
		UR_Role = uR_Role;
	}


	@Override
	public String toString() {
		return "UserRole [UR_ID=" + UR_ID + ", UR_Role=" + UR_Role + "]";
	}

}
