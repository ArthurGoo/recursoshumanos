public class Cargo {
	private String nomeCargo;
	private double salarioCargo;
	private Beneficio beneficio;
	
	public Cargo(String nomeCargo, double salarioCargo, Beneficio beneficio) {
		this.nomeCargo = nomeCargo;
		this.salarioCargo = salarioCargo;
		this.beneficio = beneficio;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public double getSalarioCargo() {
		return salarioCargo;
	}
	public void setSalarioCargo(double salarioCargo) {
		this.salarioCargo = salarioCargo;
	}
	public Beneficio getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}
	
	
}
