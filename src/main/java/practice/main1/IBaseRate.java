/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapp;

public interface IBaseRate {
	// method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}
}
