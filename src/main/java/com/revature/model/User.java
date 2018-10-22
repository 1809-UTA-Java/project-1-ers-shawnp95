package com.revature.model;

public class User {

	int U_ID;
	String U_UserName;
	String U_PassWord;
	String U_FirstName;
	String U_LastName;
	String U_Email;
	int UR_ID;

	public int getU_ID() {
		return U_ID;
	}

	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}

	public String getU_UserName() {
		return U_UserName;
	}

	public void setU_UserName(String u_UserName) {
		U_UserName = u_UserName;
	}

	public String getU_PassWord() {
		return U_PassWord;
	}

	public void setU_PassWord(String u_PassWord) {
		U_PassWord = u_PassWord;
	}

	public String getU_FirstName() {
		return U_FirstName;
	}

	public void setU_FirstName(String u_FirstName) {
		U_FirstName = u_FirstName;
	}

	public String getU_LastName() {
		return U_LastName;
	}

	public void setU_LastName(String u_LastName) {
		U_LastName = u_LastName;
	}

	public String getU_Email() {
		return U_Email;
	}

	public void setU_Email(String u_Email) {
		U_Email = u_Email;
	}

	public int getUR_ID() {
		return UR_ID;
	}

	public void setUR_ID(int uR_ID) {
		UR_ID = uR_ID;
	}


	@Override
	public String toString() {
		return "User [U_ID=" + U_ID + ", U_UserName=" + U_UserName + ", U_PassWord=" + U_PassWord + ", U_FirstName="
				+ U_FirstName + ", U_LastName=" + U_LastName + ", U_Email=" + U_Email + ", UR_ID=" + UR_ID + "]\n\n";
	}
}
