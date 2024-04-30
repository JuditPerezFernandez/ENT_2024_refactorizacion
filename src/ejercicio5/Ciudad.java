package ejercicio5;

public class Ciudad {
	
	/*
	 * Quitamos los atributos direccion, codigoPostal y ciudad 
	 * para hacerla en otras clases
	 */
	private Ciudad ciudad;

	/**
	 * get de ciudad
	 * @return ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}
	/**
	 * set de ciudad
	 * @param ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
}
