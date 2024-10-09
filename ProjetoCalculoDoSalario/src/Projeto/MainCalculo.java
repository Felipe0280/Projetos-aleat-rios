package Projeto;

import java.util.Scanner;

public class MainCalculo {
	public static float Calculo(float NumDeHoras, float ValorRecebido) {
		float Salario = NumDeHoras * ValorRecebido;
		return (Salario);
	}

	public static float HorariosFeitos(int i, float HorasT) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o horario que o funcionario inicio o expediente do " + (i + 1) + " dia :");
		String HoraInicioString = leitura.nextLine();
		float HoraFloat = Float.valueOf(HoraInicioString);
		int HoraInt = (int) HoraFloat;
		float HoraEntrada = (((HoraFloat - HoraInt) / 60) * 100)+ HoraInt;
		System.out.println("Digite o horario que o funcionario finalizou o expediente do " + (i + 1) + " dia:");
		String HoraSaidaString = leitura.nextLine();
		HoraFloat = Float.valueOf(HoraSaidaString);
		HoraInt = (int) HoraFloat;
		float HoraSaida = (((HoraFloat - HoraInt) / 60) * 100)+ HoraInt;
		HorasT = HorasT + ( HoraSaida - HoraEntrada );
		return(HorasT);
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		float HorasTrabalhadas = 0, PrecoPorHora;
		
		System.out.println("Digite o valor que o funcionario ganha por hora: ");
		String PrecoString = leitura.nextLine();
		PrecoPorHora = Float.valueOf(PrecoString);
		System.out.println("Digite quantos dias o funcionario trabalhou: ");
		String DiasString = leitura.nextLine();
		int DiasInt = Integer.valueOf(DiasString);
		System.out.println("--- TABELA DE HORARIOS ---\n");
		System.out.println("!!!!!ATENCAO!!!!!" + "\n"
				+ "AS HORAS DEVEM SER COLOCADAS NESSA FORMATACAO 13.05, SE COLOCADA DE OUTRA FORMA PODERA HAVER PROBLEMAS!");
		for (int i = 0; i < DiasInt; i++) {
			System.out.println("\n\n !!!HORARIO MATUTINO!!!");
			HorasTrabalhadas = 	HorariosFeitos(i,HorasTrabalhadas);				
			System.out.println("\n\n !!!HORARIO VESPERTINO!!!");
			HorasTrabalhadas = 	HorariosFeitos(i,HorasTrabalhadas);	
		}
		float SalarioTotal = Calculo(HorasTrabalhadas, PrecoPorHora);
		System.out.println("O salario total e de: "+SalarioTotal);
	}
}
