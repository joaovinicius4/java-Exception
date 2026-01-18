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
	
	public long duracao() {
	    return java.time.temporal.ChronoUnit.DAYS.between(checkIn, checkOut); // uso de API de tempo que nao conhecia
	}
	
	public void atualizaReserva( LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
}
