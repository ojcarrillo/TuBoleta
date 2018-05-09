package co.edu.javeriana.pica.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import co.edu.javeriana.pica.enums.EstadosReserva;
import co.edu.javeriana.pica.model.Boleta;
import co.edu.javeriana.pica.model.Reserva;
import co.edu.javeriana.pica.persistence.Persistencia;

public class Controlador {
	private  Persistencia persistencia;
	
	public Controlador() {
		this.persistencia = new Persistencia();
	}
	
	public  Reserva consultarReserva(String nroReserva) {
		return persistencia.getObject(nroReserva);
	}
	
	public  String crearReserva(List<Boleta> boletas) {
		String llave = new String();
		String mes = Calendar.getInstance().get(Calendar.MONTH)<10?"0"+(Calendar.getInstance().get(Calendar.MONTH)+1):""+Calendar.getInstance().get(Calendar.MONTH);
		Reserva reserva = new Reserva();
		reserva.setBoletas(boletas);
		Date fechaActual = new Date();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("R-");
		stringBuilder.append(fechaActual.getYear());
		stringBuilder.append(fechaActual.getMonth());
		stringBuilder.append(fechaActual.getDate());
		stringBuilder.append(fechaActual.getHours());
		stringBuilder.append(fechaActual.getMinutes());
		stringBuilder.append(fechaActual.getSeconds());
		llave = stringBuilder.toString();
		
		reserva.setIdReserva(llave);
		reserva.setEstadoReserva(EstadosReserva.RESERVADO.toString());
		reserva.setFechaReserva(""+Calendar.getInstance().get(Calendar.YEAR)+"-"+mes+"-"+Calendar.getInstance().get(Calendar.DATE));
		
		for(int i=0;i<boletas.size();i++) {
			boletas.get(i).setIdBoleta("B-"+llave+Math.random());
		}
		
		persistencia.saveObject(llave, reserva);
		
		return llave;
	}
	
	public  boolean cancelarReserva(String nroReserva) {
		return persistencia.deleteObject(nroReserva);
	}
	
}
