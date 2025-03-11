package ExamenKarina;

public class Pintura extends ObraArte implements Exhibir, Vender{
	private String tecnica;

	public Pintura(String titulo, String autor, String creacion, String tecnica) {
		super(titulo, autor, creacion);
		this.tecnica = tecnica;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	@Override
	public String toString() {
		return "Pintura [tecnica=" + tecnica + "]";
	}

	@Override
	public void SeVende() {
		System.out.println("Se puede vender");
		
	}

	@Override
	public void SeExhibe() {
		System.out.println("Se puede exhibir");	
	}	

}
