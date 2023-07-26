package domain;

import java.util.Date;

public class Profesional extends Usuario {

  // Atributos específicos del profesional
  private String titulo;
  private Date fechaIngreso;

  // Constructor con parámetros
  public Profesional(String nombreUsuario, Date fechaNacimiento, int run, String titulo, Date fechaIngreso) {
    super(nombreUsuario, fechaNacimiento, run);
    this.titulo = titulo;
    this.fechaIngreso = fechaIngreso;
  }

  // Constructor sin parámetros
  public Profesional(String nombreUsuario, Date fechaNacimiento, int run) {
    super(nombreUsuario, fechaNacimiento, run);

  }

  public Profesional() {
    super();
  }

  // Métodos específicos del profesional

  // Implementación del método analizarUsuario()
  @Override
  public void analizarUsuario() {
    System.out.println("Análisis de Usuario:");
    super.analizarUsuario();
    System.out.println("Nombre: " + nombreUsuario);
    System.out.println("RUN: " + run);
    System.out.println("Título: " + titulo);
    System.out.println("Fecha de Ingreso: " + fechaIngreso);
  }

  @Override
  public void mostrarEdad() {
    Long edad = calcularEdad();
    System.out.println("El usuario tiene " + edad + " años.");
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Date getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  @Override
  public String toString() {
    return super.toString() + " TIPO:  Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
  }

  /*
   * 
   * Profesional:
   * 
   * - Título: obligatorio, mínimo 10 caracteres, máximo 50
   * - Fecha de ingreso: independiente si lo declara como una fecha o un String,
   * debe
   * ser desplegado con el formato DD/MM/AAAA
   */
}
