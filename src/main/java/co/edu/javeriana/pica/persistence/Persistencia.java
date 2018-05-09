package co.edu.javeriana.pica.persistence;

import java.util.Hashtable;

import co.edu.javeriana.pica.model.Reserva;

public class Persistencia {
	private  Hashtable<String, Reserva> hash;
	public Persistencia() {
		hash = new Hashtable<String, Reserva>();
	}
	
	public  Reserva getObject(String llave) {
		if(hash.containsKey(llave)) 
			return (Reserva) hash.get(llave);
		return new Reserva();
	}
	
	public  void saveObject(String llave,Reserva reserva) {
		hash.put(llave, reserva);
	}
	
	public  boolean deleteObject(String llave) {
		if(hash.containsKey(llave)) {
			hash.remove(llave);
			return true;
		}
			
		return false;
	}

}
