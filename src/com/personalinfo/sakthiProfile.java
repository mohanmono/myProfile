package com.personalinfo;

public class sakthiProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"sakthi");
		System.out.println(ProfileConstant.LAST_NAME+"vel");		// TODO Auto-generated method stub
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My friend hobbie is cricket");
}

}
