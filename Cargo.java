public class Cargo {

    private String nomeCargo;
    private double salarioCargo;
    private double gratificacao; 
    private double horaExtra; 
    private double valeAlimentacao; 
    private double valeTransporte;


    public Cargo (String nomeCargo, double salarioCargo, double gratificacao, double horaExtra, double valeAlimentacao, double valeTransporte) {
        this.nomeCargo = nomeCargo;
        this.salarioCargo = salarioCargo;
        this.gratificacao = gratificacao;
        this.horaExtra = horaExtra;
        this.valeAlimentacao = valeAlimentacao;
        this.valeTransporte = valeTransporte;
    }

    public String getNomeCargo () {
        return nomeCargo;
    }
    public void setNomeCargo (String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }
    public double getSalarioCargo () {
        return salarioCargo;
    }
    public void setSalarioCargo(double salarioCargo) { 
        this.salarioCargo = salarioCargo; 
    } 
    public double getGratificacao() { 
        return gratificacao; 
    } 
    public void setGratificacao(double gratificacao) { 
        this.gratificacao = gratificacao; 
    } 
    public double getHoraExtra() { 
        return horaExtra; 
    } 
    public void setHoraExtra(double horaExtra) { 
        this.horaExtra = horaExtra; 
    } 
    public double getValeAlimentacao() { 
        return valeAlimentacao; 
    } 
    public void setValeAlimentacao(double valeAlimentacao) { 
        this.valeAlimentacao = valeAlimentacao; 
    } 
    public double getValeTransporte() { 
        return valeTransporte; 
    } 
    public void setValeTransporte(double valeTransporte) { 
        this.valeTransporte = valeTransporte; 
    } 
     
}
