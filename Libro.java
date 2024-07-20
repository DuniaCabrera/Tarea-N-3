/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprincipal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class Libro {
   private String Titulo;
   private String Autor;
   private int AñoPublicacion;
   private String Genero;
   private String Disponible;
   
   Libro(String T, String A, int P, String G, String D){
       Titulo = T;
       Autor = A;
       AñoPublicacion = P;
       Genero = G;
       Disponible = D;
   }
   
   public String getTitulo(){
       return Titulo;
   }
   public String getAutor(){
       return Autor;
   }
   public int getAñoPublicacion(){
       return AñoPublicacion;
   }
   public String getGenero(){
       return Genero;
   }
   public String getDisponible(){
       return Disponible;
   }
   
   public void setDisponible( String D) {
        Disponible = D;
   }
   
   public String toString(){
      class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro); 
   }
     public List<Libro> buscarLibro(String criterio, String valor) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (criterio.equals("Titulo") && libro.getTitulo().equalsIgnoreCase(valor)) {
                resultados.add(libro);
            } else if (criterio.equals("Autor") && libro.getAutor().equalsIgnoreCase(valor)) {
                resultados.add(libro);
            }
            return resultados;
        }
        
        public void prestarLibro(String Titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(Titulo) && libro.isDisponible()) {
                libro.setDisponible(false);
                System.out.println("Se ha prestado el libro: " + Titulo);
                return;
            }
        }
        System.out.println("El libro " + Titulo + " no está disponible para préstamo.");
    }

    public void devolverLibro(String Titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(Titulo) && !libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("Se ha devuelto el libro: " + Titulo);
                return;
            }
        }
        System.out.println("El libro " + Titulo + " no ha sido prestado.");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAñoPublicacion() + " - " + libro.getGenero());
            }
     public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca biblioteca = new Biblioteca();

        // Agregar algunos libros de ejemplo
        biblioteca.agregarLibro(new Libro("Malaga Burning, "J.R.R. Tolkien", 1954, "Fantasía"));
        biblioteca.agregarLibro(new Libro("Extra Indians", "Gabriel García Márquez", 1967, "A sea of violet"));

        // Pruebas de las operaciones
        System.out.println("Pruebas de la biblioteca:");
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.prestarLibro("Malaga Burning");
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.devolverLibro("Extra Indians");
        biblioteca.mostrarLibrosDisponibles();
   
}
