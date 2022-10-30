package com.lesson.game;

public class Elf extends Character {
	
	public Elf(String newName) {
		super(newName, "Elf");	
	}
	
	public int doArchery(int amount) {
		System.out.println("Doing archery "+amount+"...");
		return amount * 3;
	}
}
