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

        Reserva reserva = null;

        // LOOP ATÉ CRIAR UMA RESERVA VÁLIDA
        while (reserva == null) {
            try {
                System.out.print("Numero do quarto: ");
                int numero = sc.nextInt();

                System.out.print("Data de check-in (dd/MM/yyyy): ");
                LocalDate checkIn = LocalDate.parse(sc.next(), dtf);

                System.out.print("Data de check-out (dd/MM/yyyy): ");
                LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

                reserva = new Reserva(numero, checkIn, checkOut);
                System.out.println("Reserva criada com sucesso!");
                System.out.println(reserva);

            }
            catch (InputMismatchException e) {
                System.out.println("Erro: o número do quarto deve ser um inteiro.");
                sc.nextLine(); // limpa o buffer
            }
            catch (DateTimeParseException e) {
                System.out.println("Erro: formato de data inválido.");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // ATUALIZAÇÃO DA RESERVA (TAMBÉM COM LOOP)
        boolean atualizado = false;

        while (!atualizado) {
            try {
                System.out.println("\nEntre com a nova data da reserva:");

                System.out.print("Check-in: ");
                LocalDate checkIn = LocalDate.parse(sc.next(), dtf);

                System.out.print("Check-out: ");
                LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

                reserva.atualizaReserva(checkIn, checkOut);
                System.out.println("Reserva atualizada com sucesso!");
                System.out.println(reserva);

                atualizado = true;
            }
            catch (DateTimeParseException e) {
                System.out.println("Erro: formato de data inválido.");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}
