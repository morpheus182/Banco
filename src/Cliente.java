
public class Cliente {
  private String nombre;
  private String apellido;
  private Cuenta cuenta;
  
  public Cliente(String nom, String app)
  {
	  nombre = nom;
	  apellido = app;
  }
  
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Cuenta getCuenta() {
	return cuenta;
}
public void setCuenta(Cuenta cuenta) {
	this.cuenta = cuenta;
}
 
}
