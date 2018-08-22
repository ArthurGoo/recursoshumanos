
import java.util.ArrayList;
import java.util.List;

public class Cargos {
	private List<Cargo> todosCargos;

	public Cargos() {
		
		this.todosCargos = new ArrayList <Cargo> ();
	} 

	public List<Cargo> getTodosCargos() {
		return todosCargos;
	}

	public void setTodosCargos(List<Cargo> todosCargos) {
		this.todosCargos = todosCargos;
	}
	
	public Cargo getBuscarCargo(String nomeCargo){
		for (Cargo c: this.todosCargos){
			if (c.getNomeCargo().equals(nomeCargo)){
				return c;
				
			}
		}
		return null;
	}
	public Beneficio beneficioDeCargo (String nomeCargo){
		
        	Cargo c = getBuscarCargo(nomeCargo);
		if (c != null){
			return c.getBeneficio();
		}
		return null;
	}
}
