package domain;

import java.util.Date;

public class Cliente extends Usuario {

  // Atributos específicos del cliente

  private int rut;
  private String nombres;
  private String apellidos;
  private String telefono;
  private String afp;
  private int sistemaSalud;
  private String direccion;
  private String comuna;

  // Constructor con parámetros
  public Cliente(String nombreUsuario, Date fechaNacimiento, int run, int rut, String nombres, String apellidos,
      String telefono, String afp, int sistemaSalud, String direccion, String comuna) {
    super(nombreUsuario, fechaNacimiento, run);
    this.rut = rut;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.afp = afp;
    this.sistemaSalud = sistemaSalud;
    this.direccion = direccion;
    this.comuna = comuna;
  }

  // Constructor sin parámetros
  public Cliente() {
    super("", null, 0);
    this.rut = 0;
    this.nombres = "";
    this.apellidos = "";
    this.telefono = "";
    this.afp = "";
    this.sistemaSalud = 0;
    this.direccion = "";
    this.comuna = "";
  }

  public Cliente(String nombreUsuario, Date fechaNacimiento, int run) {
    super(nombreUsuario, fechaNacimiento, run);
  }

  // Métodos específicos del cliente

  public String obtenerNombre() {
    return nombres + " " + apellidos;
  }

  public void obtenerSistemaSalud() {
    if (sistemaSalud == 1) {
      System.out.println("Sistema de Salud: Fonasa");
    } else if (sistemaSalud == 2) {
      System.out.println("Sistema de Salud: Isapre");
    } else {
      System.out.println("Sistema de Salud: Desconocido");
    }
  }

  // Implementación del método analizarUsuario()
  @Override
  public void analizarUsuario() {
    super.analizarUsuario();
    System.out.println("Análisis de Usuario:");
    System.out.println("Nombre: " + nombreUsuario);
    System.out.println("RUN: " + run);
    System.out.println("Dirección: " + direccion);
    System.out.println("Comuna: " + comuna);
  }

  @Override
  public void mostrarEdad() {
    Long edad = calcularEdad();
    System.out.println("El usuario tiene " + edad + " años.");
  }

  public int getRut() {
    return rut;
  }

  public void setRut(int rut) {
    this.rut = rut;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getAfp() {
    return afp;
  }

  public void setAfp(String afp) {
    this.afp = afp;
  }

  public int getSistemaSalud() {
    return sistemaSalud;
  }

  public void setSistemaSalud(int sistemaSalud) {
    this.sistemaSalud = sistemaSalud;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getComuna() {
    return comuna;
  }

  public void setComuna(String comuna) {
    this.comuna = comuna;
  }

  @Override
  public String toString() {
    return super.toString() + " TIPO:  Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos
        + ", telefono=" + telefono
        + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + "]";
  }


  /*
   * Cliente:
   * 
   * - RUT: corresponde a un número menor a 99.999.999
   * - Nombres: obligatorio, mínimo 5 caracteres, máximo 30
   * - Apellidos: obligatorio, mínimo 5 caracteres, máximo 30
   * - Teléfono: obligatorio
   * - AFP: mínimo 4 caracteres, máximo 30
   * - Sistema de salud: 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos
   * opciones indicadas
   * - Dirección: máximo 70 caracteres
   * - Comuna: máximo 50 caracteres
   * - Edad: obligatorio, número mayor o igual a cero, y menor a 150
   * 
   */

}
