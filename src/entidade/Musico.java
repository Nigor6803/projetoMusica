package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.NivelProfissional;

public class Musico {
	private String nome;
	private NivelProfissional nivel;
	private Double salarioBase;
	
	private Instrumento instrumento;
	
	private List <HoraPorTocada> contratoMusical = new ArrayList<>();
	
	public Musico() {
		}
	
	public Musico(String nome, NivelProfissional nivel,Double salarioBase, Instrumento instrumento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.instrumento = instrumento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public NivelProfissional getNivel() {
		return nivel;
	}
	
	public void setNivel(NivelProfissional nivel) {
		this.nivel = nivel;
	}
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Instrumento getInstrumento() {
		return instrumento;
	}
	
	public List<HoraPorTocada> getContrato(){
		return contratoMusical;
	}
	
	public void addContratos(HoraPorTocada contrato) {
		contratoMusical.add(contrato); 
	}
	
	public void removeContratos(HoraPorTocada contrato) {
		contratoMusical.remove(contrato);
	}
	
	public double rendaFinal(int ano,int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraPorTocada c : contratoMusical) {
			cal.setTime(c.getDiaDaApresentacao());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	} 
}
