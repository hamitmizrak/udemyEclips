package com.sirketadi.proje;

public interface IDeneme {

	void denemeMethod();

	default void method() {
		System.out.println("Deneme");
	}
}
