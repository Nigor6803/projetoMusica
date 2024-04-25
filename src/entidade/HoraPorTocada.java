package entidade;

import java.util.Date;

public class HoraPorTocada {
	
	private Date diaDaApresentacao;
	private Double valorPorHora;
	private Integer horas;
	
	public HoraPorTocada() {
		}
	
	public HoraPorTocada(Date diaDaApresentacao, Double valorPorHora, Integer horas) {
		this.diaDaApresentacao = diaDaApresentacao;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	public Date getDiaDaApresentacao() {
		return diaDaApresentacao;
	}
	
	public void setDiaDaApresentacao(Date DiaDaApresentacao) {
		this.diaDaApresentacao = DiaDaApresentacao;
	}
	
	public Double getValorPorHora() {
		return valorPorHora;
	}
	
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Integer getHoras() {
		return horas;
	}
	
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorPorHora*horas;
	}
}
