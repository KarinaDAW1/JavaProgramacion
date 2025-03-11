package ExamenKarina;

public abstract class ObraArte {
	private String titulo;
	private String autor;
	private String creacion;
	
	public ObraArte(String titulo, String autor, String creacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.creacion = creacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCreacion() {
		return creacion;
	}

	public void setCreacion(String creacion) {
		this.creacion = creacion;
	}

	@Override
	public String toString() {
		return "ObraArte [titulo=" + titulo + ", autor=" + autor + ", año_de_creacio=" + creacion + "]";
	}
	
	
	
	
	
	
	
}
