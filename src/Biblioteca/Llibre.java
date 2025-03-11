package Biblioteca;


public class Llibre {
    private String titulo;
    protected String autor;
    private String categoria;
    private int añoCreacion;
    private String editorial;
    
    public Llibre(String titulo, String autor, String categoria, int añoCreacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.añoCreacion = añoCreacion;
        this.editorial = editorial;
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
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getAñoCreacion() {
        return añoCreacion;
    }
    
    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public String informacionLibro() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Categoría: " + categoria + "\n" +
               "Año de creación: " + añoCreacion + "\n" +
               "Editorial: " + editorial + "\n";
    }
    
    @Override
    public String toString() {
        return informacionLibro();
    }
}
