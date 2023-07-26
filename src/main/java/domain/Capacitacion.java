package domain;

public class Capacitacion {
  // Atributos de la capacitación
  private int identificador;
  private int rutCliente;
  private String dia;
  private String hora;
  private String lugar;
  private String duracion;
  private int cantidadAsistentes;

  // Constructor con parámetros
  public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion,
      int cantidadAsistentes) {
    this.identificador = identificador;
    this.rutCliente = rutCliente;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.duracion = duracion;
    this.cantidadAsistentes = cantidadAsistentes;
  }

  public Capacitacion() {

  }

  // Métodos específicos de la capacitación

  // Método para mostrar el detalle de la capacitación
  public void mostrarDetalle() {
    System.out.println("La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará "
        + duracion + " minutos.");
  }

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  public int getRutCliente() {
    return rutCliente;
  }

  public void setRutCliente(int rutCliente) {
    this.rutCliente = rutCliente;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public String getDuracion() {
    return duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public int getCantidadAsistentes() {
    return cantidadAsistentes;
  }

  public void setCantidadAsistentes(int cantidadAsistentes) {
    this.cantidadAsistentes = cantidadAsistentes;
  }

  @Override
  public String toString() {
    return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
        + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes=" + cantidadAsistentes + "]";
  }

  /*
   * Capacitación:
   * 
   * - Identificador: obligatorio, número interno de la capacitación manejado por
   * la empresa
   * - RUT cliente: obligatorio
   * - Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
   * “Domingo” (en ese formato)
   * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
   * 23, minutos entre 0 y 59)
   * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
   * - Duración: máximo 70 caracteres
   * - Cantidad de asistentes: obligatorio, número entero menor que 1000 Accidente
   * - Identificador del accidente: obligatorio, número interno manejado por la
   * compañía.
   * - RUT Cliente: obligatorio
   * - Día: fecha del accidente, independiente si lo declara como una fecha o un
   * String,
   * debe ser desplegado con el formato DD/MM/AAAA
   * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
   * 23, minutos entre 0 y 59)
   * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
   * - Origen: máximo 100 caracteres
   * - Consecuencias: máximo 100 caracteres
   * 
   */

}
