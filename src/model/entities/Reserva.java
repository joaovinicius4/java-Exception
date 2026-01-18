package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Reserva {
	private Integer numero;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
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
		
		LocalDate now = LocalDate.now();
		if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new IllegalArgumentException("As reservas precisam ser depois da data atual");
		}
		if(checkOut.isBefore(checkIn)) {
			throw new IllegalArgumentException("O check tem que ser depois do check-in");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	
	@Override
	public String toString() {
		return "Room:" +
				numero +
				", checkIn: " +
				dtf.format(checkIn) +
				", checkOut: " +
				dtf.format(checkOut)+
				", Noites: " +
				duracao();
	}
}
