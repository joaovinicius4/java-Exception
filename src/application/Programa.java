package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Reserva;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Numero do quarto: ");
			int numero = sc.nextInt();
			System.out.print("Data de check-in (dd/MM/yyyy): ");
		    LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
		    System.out.print("Data de check-out (dd/MM/yyyy): ");
		    LocalDate checkOut = LocalDate.parse(sc.next(), dtf);
		    
		    Reserva reserva = new Reserva(numero, checkIn, checkOut);
		    System.out.println("Reserva: "+ reserva);
		    
		    
		    System.out.println("Entre com a nova data de reserva: ");
		    System.out.println("Check-in: ");
		    checkIn = LocalDate.parse(sc.next(), dtf);
		    System.out.print("Check-out: ");
		    checkOut = LocalDate.parse(sc.next(), dtf);
		    reserva.atualizaReserva(checkIn, checkOut);
		    System.out.println("Reserva: "+ reserva);
		}
        catch(InputMismatchException e) {
        	System.out.println("Deve ser digitado numero inteiro para o numero do quarto! ");
        }
		catch(DateTimeParseException e) {
			System.out.println("Formato de data digitado errado!");
		}
        
		sc.close();
	}


}
