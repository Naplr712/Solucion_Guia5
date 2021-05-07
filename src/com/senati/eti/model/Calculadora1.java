package com.senati.eti.model;

public class Calculadora1 {
	// Atributos
	private float numero1;
	private float numero2;
	
	// Definir métodos Getters y Setters
	// Get: obtener el valor del atributo
	// Set: Definir el valor para el atributo
	
	// Función  -> Devolver un resultado
	public float getNumero1() {
		return this.numero1;
	}
	
	// Procedimiento  -> Ejecutar un bloque de codigo
	public void setNumero1(float num1) {
		this.numero1 = num1;
	}
	
	public float getNumero2() {
		return this.numero2;
	}
	
	public void setNumero2(float num2) {
		this.numero2 = num2;
	}
	
	// Definir los constructores
	// Constructor: Permite iniciar los valores para 
	// los atrivutos de la clase
	// Sobrecarga: Dos constructores pero con diferentes sintaxis
	
	// constructor vacío
	public Calculadora1() {
		
	}
	
	// Constructor con parámetros de entrada
	public Calculadora1(float num1, float num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	// Métodos Personalizados
	public float Suma() {
		return this.numero1 + this.numero2;
	}
	
	public float Resta() {
		return this.numero1 - this.numero2;
	}
	
	public float Producto() {
		return this.numero1 * this.numero2;
	}
	
	public float Division() {
		float r = 0;
		
		if (this.numero2 != 0)
			r = this.numero1 / this.numero2;
		
		return r;
	}
	
	public float RestoEntero() {
		float r = 0;
		
		if (this.numero2 != 0)
			r = this.numero1 % this.numero2;
		
		return r;
	}
	
	
	
	
	
	
}
