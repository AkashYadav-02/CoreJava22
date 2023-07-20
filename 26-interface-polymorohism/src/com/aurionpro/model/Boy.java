package com.aurionpro.model;

public class Boy implements IEmotionable,IMannerable {

	@Override
	public void welcomeGreet() {
		System.out.println(" Boy Welcome Greeted");
		
	}

	@Override
	public void departGreet() {
		// TODO Auto-generated method stub
		System.out.println(" Boy Departed  Greeted");
		
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println(" Boy Laughing");
		
		
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println(" Boy Crying");
		
	}

}
