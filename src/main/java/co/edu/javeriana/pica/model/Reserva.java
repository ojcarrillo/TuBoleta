package co.edu.javeriana.pica.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reserva {
	private List<Boleta> boletas;
	private String idReserva,fechaReserva,estadoReserva;
	public Reserva() {
		boletas = new ArrayList<Boleta>();
		idReserva="";
		fechaReserva="";
		estadoReserva="";
	}

	public List<Boleta> getBoletas() {
		return boletas;
	}

	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}
	
	public String getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

	public String getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(String fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public int cantidadReservas() {
		return boletas.size();
	}
	
	public String toString() {
		return "idReserva :: "+this.getIdReserva()+"::estadoReserva::"+this.getEstadoReserva()+"::fechaReserva::"+this.getFechaReserva()+"::cantBoletas::"+boletas.size();
	}
}
