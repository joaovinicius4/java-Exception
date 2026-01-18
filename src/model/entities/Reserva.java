package model.entities;

import java.time.LocalDate;

public class Reserva {
	private Integer numero;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reserva(Integer numero, LocalDate checkIn, LocalDate checkOut) {
		this.numero = numero;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumero() {
		return numero;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}	
	
}
