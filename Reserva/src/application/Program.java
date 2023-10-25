package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de check-in (dd/mm/aaaa): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de check-out (dd/mm/aaaa): ");
		Date checkOut = sdf.parse(sc.next());
		if(!checkOut.after(checkIn)) {
			System.out.println("ERRO DE RESERVA: DATA DE CHECK-OUT DEVE SER APÓS DATA DE CHECK-IN");
		}else {
			Reservation reservation = new Reservation (numero,checkIn,checkOut);

			System.out.println("Reserva: " + reservation);
			System.out.println("Enter data to update reservation: ");
			System.out.print("Data de check-in (dd/mm/aaaa): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/mm/aaaa): ");
			checkOut = sdf.parse(sc.next());

		}


		sc.close();
	}

}
