package co.edu.javeriana.pica.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
	private String nombre,apellido,tipoDocIdentidad,nroDocIdentidad,nroTelefono,correo;
	
	public Persona() {
		this.nombre  ="";
		this.apellido  ="";
		this.tipoDocIdentidad  ="";
		this.nroDocIdentidad  ="";
		this.nroTelefono  ="";
		this.correo  ="";
	}

	public Persona(String nombre, String apellido, String tipoDocIdentidad, String nroDocIdentidad, String nroTelefono,
			String correo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocIdentidad = tipoDocIdentidad;
		this.nroDocIdentidad = nroDocIdentidad;
		this.nroTelefono = nroTelefono;
		this.correo = correo;
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

	public String getTipoDocIdentidad() {
		return tipoDocIdentidad;
	}

	public void setTipoDocIdentidad(String tipoDocIdentidad) {
		this.tipoDocIdentidad = tipoDocIdentidad;
	}

	public String getNroDocIdentidad() {
		return nroDocIdentidad;
	}

	public void setNroDocIdentidad(String nroDocIdentidad) {
		this.nroDocIdentidad = nroDocIdentidad;
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
