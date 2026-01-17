package model.entities;

import java.time.LocalDate;

public class Reserva {
	private Integer numero;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public Reserva(Integer numero, LocalDate checkin, LocalDate checkout) {
		this.numero = numero;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}	
	
}
