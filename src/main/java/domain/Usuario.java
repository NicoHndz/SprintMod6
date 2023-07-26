package domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import repositories.AdvisoryRepository;

public class Usuario implements AdvisoryRepository {

  // Atributos
  public String nombreUsuario;
  public Date fechaNacimiento;
  public int run;

  // Constructor con parámetros
  public Usuario(String nombreUsuario, Date fechaNacimiento, int run) {
    this.nombreUsuario = nombreUsuario;
    this.fechaNacimiento = fechaNacimiento;
    this.run = run;
  }

  public Usuario() {
    super();
  }

  // Getters y setters
  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public int getRun() {
    return run;
  }

  public void setRun(int run) {
    this.run = run;
  }
  // Método toString()

  @Override
  public String toString() {
    return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
        + "]";
  }

  // Método calcularEdad()
  public Long calcularEdad() {

    Date Hoy = new Date();

    long timeDiff = Math.abs(Hoy.getTime() - fechaNacimiento.getTime());
    long days = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
    long year = days / 365;
    return year;
  }

  // Método mostrarEdad()
  @Override
  public void mostrarEdad() {
    Long edad = calcularEdad();
    System.out.println("El usuario tiene " + edad + " años.");
  }

  // Método analizarUsuario()
  @Override
  public void analizarUsuario() {

    System.out.println("Análisis de Usuario:");
    System.out.println("Nombre: " + nombreUsuario);
    System.out.println("RUN: " + run);

  }
  // Métodos de validación de nombre y RUN

  /*
   * Usuario:
   * 
   * - Nombre: obligatorio, mínimo 10 caracteres, máximo 50
   * - Fecha de nacimiento: obligatorio, independiente si lo declara como una
   * fecha o * string, debe ser desplegado con el formato DD/MM/AAAA
   * - RUN: corresponde a un número menor a 99.999.999
   * 
   */

}
