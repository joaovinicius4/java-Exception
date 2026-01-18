package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de check-in (dd/MM/yyyy): ");
	    LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
	    System.out.print("Data de check-out (dd/MM/yyyy): ");
	    LocalDate checkOut = LocalDate.parse(sc.next(), dtf);
	    
	    Reserva reserva = new Reserva(numero, checkIn, checkOut);

        System.out.println();
        System.out.println("Reserva: " + reserva);
        
        
		sc.close();
	}

}
