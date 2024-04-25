package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.HoraPorTocada;
import entidade.Instrumento;
import entidade.Musico;
import entidade.enums.NivelProfissional;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner edd = new Scanner(System.in);
		
		System.out.println("FUNCIONARIO");
		System.out.print("MÚSICO:");
		String nome = edd.nextLine();
		System.out.print("INSTRUMENTO:");
		String instrumento = edd.nextLine();
		System.out.print("TITULAR NA BANDA COMO:");
		String cargo = edd.nextLine();
		System.out.print("SALARIO BASE:R$");
		Double salarioBase = edd.nextDouble();
		
		Musico musico = new Musico(nome,NivelProfissional.valueOf(cargo),salarioBase,new Instrumento(instrumento));
		
		System.out.print("QUANTIDADE DE CONTRATOS:");
		int n = edd.nextInt();
		
		for (int i = 1;i<=n;i++) {
			System.out.println("CONTRATO #"+i);
			System.out.print("DATA DA APRESENTAÇÃO: (DD/MM/YYYY)");
			Date apresentacao = sdf.parse(edd.next());
			System.out.print("VALOR DA APRESENTAÇÃO:");
			double valorPelaTocada = edd.nextDouble();
			System.out.print("TEMPO DO SHOW:");
			int tempo = edd.nextInt();
			
			HoraPorTocada contratoFinal = new HoraPorTocada(apresentacao,valorPelaTocada,tempo);
			musico.addContratos(contratoFinal);
		}
		
		System.out.println();
		System.out.print("MÊS E ANO PARA CALCULAR SALARIO: ");
		String mesEAno = edd.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("NOME:"+ musico.getNome());
		System.out.println("INSTRUMENTO:"+ musico.getInstrumento().getNomeDoInstrumento());
		System.out.println("CARGO NA BANDA:" + musico.getNivel());
		System.out.println("RENDA FINAL DO "+mesEAno+": R$"+String.format("%.2f",musico.rendaFinal01(ano, mes)));

		edd.close();
	}

}
