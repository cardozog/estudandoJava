package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	// ## DATA E HORA
	// DATA E HORA LOCAL
	//	LocalDate
	//	LocalDateTime




	public static void main(String[] args) {
		//Instanciação


		LocalDate data4 = LocalDate.parse("2023-08-01");


		System.out.println("-----------------------------------------");
		LocalDate data1=LocalDate.now();
		System.out.println("LocalDate: "+data1);
		System.out.println("-----------------------------------------");
		LocalDateTime data2= LocalDateTime.now();
		System.out.println("LocalDateTime: "+ data2);
		System.out.println("-----------------------------------------");
		Instant data3 = Instant.now();
		System.out.println("Instant: "+ data3);
		System.out.println("-----------------------------------------");
		System.out.println("Parse: "+ data4);
		System.out.println("-----------------------------------------");

		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatHorarioLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("LocalDate: "+data1.format(formatado));

		//PARA VER O INSTANTE COM O FORMATAR PARA HORÁRIO LOCAL
		System.out.println("Local date: "+formatHorarioLocal.format(data3));

		//converter data e hora global para local

		//for(String s : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
		//}

		LocalDate r1 = LocalDate.ofInstant(	data3, ZoneId.systemDefault());
		System.out.println(r1);
	}

}
