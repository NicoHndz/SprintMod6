package domain;

import java.util.Date;

public class Administrativo extends Usuario {

  // Atributos específicos del administrativo
  private String area;
  private String experienciaPrevia;

  // Constructor con parámetros
  public Administrativo(String nombreUsuario, Date fechaNacimiento, int run, String area, String experienciaPrevia) {
    super(nombreUsuario, fechaNacimiento, run);
    this.area = area;
    this.experienciaPrevia = experienciaPrevia;
  }

  // Constructor sin parámetros
  public Administrativo(String Name, Date fechaNacimiento, int run) {
    super(Name, fechaNacimiento, run);

  }

  // Métodos específicos del administrativo

  // Implementación del método analizarUsuario()
  @Override
  public void analizarUsuario() {
    System.out.println("Análisis de Usuario:");
    super.analizarUsuario();
    System.out.println("Nombre: " + nombreUsuario);
    System.out.println("RUN: " + run);
    System.out.println("Área: " + area);
    System.out.println("Experiencia Previa: " + experienciaPrevia);
  }

  @Override
  public void mostrarEdad() {
    Long edad = calcularEdad();
    System.out.println("El usuario tiene " + edad + " años.");
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getExperienciaPrevia() {
    return experienciaPrevia;
  }

  public void setExperienciaPrevia(String experienciaPrevia) {
    this.experienciaPrevia = experienciaPrevia;
  }

  @Override
  public String toString() {
    return super.toString() + " TIPO:  Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
  }

  // Getters y setters

  /*
   * 
   * Administrativo:
   * 
   * - Área: obligatorio, mínimo 5 caracteres, máximo 20
   * - Experiencia previa: máximo 100 caracteres
   */

}
