package co.edu.javeriana.pica.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Boleta {
	private Persona persona;
	private String tipoEvento,lugar,sector,fila,silla,grada,idBoleta,fecha,hora;
	private float valor;
	
	public Boleta() {
		persona = new Persona();
		tipoEvento="";
		lugar="";
		sector="";
		fila="";
		silla="";
		grada="";
		idBoleta="";
		fecha="";
		hora="";
	}

	public Boleta(Persona persona, String tipoEvento, String lugar, String sector, String fila, String silla,
			String grada, String idBoleta, String fecha, String hora, float valor) {
		
		this.persona = persona;
		this.tipoEvento = tipoEvento;
		this.lugar = lugar;
		this.sector = sector;
		this.fila = fila;
		this.silla = silla;
		this.grada = grada;
		this.idBoleta = idBoleta;
		this.fecha = fecha;
		this.hora = hora;
		this.valor = valor;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public String getSilla() {
		return silla;
	}

	public void setSilla(String silla) {
		this.silla = silla;
	}

	public String getGrada() {
		return grada;
	}

	public void setGrada(String grada) {
		this.grada = grada;
	}

	public String getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	
}
