package Projeto;

import java.util.Scanner;


public class MainCalculo {
	public static float Calculo(float NumDeHoras,float ValorRecebido) {
		float Salario;
		Salario = NumDeHoras * ValorRecebido;
		
		return (Salario);
	}
	public static float TrocaTipo(String Horario) {
		float HorarioCerto;
		HorarioCerto = Float.valueOf(Horario);
		return(HorarioCerto);
	}

	public static void main(String[] args) {
		 Scanner leitura = new Scanner(System.in);
		 float HorasTrabalhadas, PrecoPorHora;
		 System.out.println("Digite o valor que o funcionario ganha por hora: ");
		 String PrecoString = leitura.nextLine();
		 PrecoPorHora = Float.valueOf(PrecoString);
		 System.out.println("Digite quantos dias o funcionario trabalhou: ");
		 String DiasString = leitura.nextLine();
		 int DiasInt = Integer.valueOf(DiasString);
		 System.out.println("--- TABELA DE HORARIOS ---");
		 for(int i=0; i < DiasInt; i++) {
			 System.out.println("Digite o horario que o funcionario inicio o expediente do dia "+i+" :");
			 String HoraInicioString = leitura.nextLine();
			 float H1 = TrocaTipo(HoraInicioString);
			 System.out.println(H1);
		 }
	}
	}
