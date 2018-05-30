package revisao;

import java.util.Calendar;

public class PrincipalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();

		System.out.println("Data/Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		c.add(Calendar.DATE, +150);
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Data atual: " + c.get(Calendar.DAY_OF_MONTH) + "/"
				+ c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
		
		System.out.println("hora: "+ c.get(Calendar.HOUR));
		System.out.println("minutos: "+ c.get(Calendar.MINUTE));
		System.out.println("segundos: "+ c.get(Calendar.SECOND));
	}

}
