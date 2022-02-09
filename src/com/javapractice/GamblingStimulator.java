package com.javapractice;

public class GamblingStimulator {
	public static void main(String[] args) {
		int stake = 100;
		int bet = 1 ;
		
		System.out.println("Welcome to gambling simulator");
		
		double Betting = Math.floor(Math.random()*100)%2;
		if (Betting ==bet) {
			stake++;
			System.out.println("Gambler is winning $1");
			System.out.println("stake" +stake);
		}
		else {
			stake--;
			System.out.println("Gambler is loosing");
		}
	}
}