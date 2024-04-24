package entidade;

public class Instrumento {
	
	private String nomeDoInstrumento;
	
	public Instrumento() {
		}
	
	public Instrumento(String nomeDoInstrumento) {
		this.nomeDoInstrumento = nomeDoInstrumento;
	}
	
	public String getNomeDoInstrumento() {
		return nomeDoInstrumento;
	}
	
	public void setNomeDoInstrumento(String nomeDoInstrumento) {
		this.nomeDoInstrumento = nomeDoInstrumento;
	}
}
