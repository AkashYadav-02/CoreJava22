package com.aurionpro.model;

public class Genric<T extends Reactangle> {

	private T value;

	public Genric(T value) {
		super();
		this.value = value;
	}

	public void print() {
		System.out.println(value);

	}

	@Override
	public String toString() {
		return "Genric [value=" + value + "]";
	}

}
