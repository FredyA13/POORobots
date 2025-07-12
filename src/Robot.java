
abstract public class Robot {
	
	private String nombre;
	private int altura;
	private int peso;
	private int nivelBateria;
	
	public Robot(String nombre) {
		this.nombre = nombre;
	}//Robot
	
	public Robot(){
		nombre = "Robot desconocido";
	}//constructor vacio

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public int getAltura() {
		return altura;
	}//getAltura

	public void setAltura(int altura) {
		this.altura = altura;
	}//setAltura

	public int getPeso() {
		return peso;
	}//getPeso

	public void setPeso(int peso) {
		this.peso = peso;
	}//setPeso

	public int getNivelBateria() {
		return nivelBateria;
	}//getNivelBateria

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}//setNivelBateria
	
	public void encender(){
		System.out.println("Robot encendido!");
	}//encender
	
	public void apagar(){
		System.out.println("Robot apagado!");
	}//apagar
	
	public void cargarBateria(){
		System.out.println("Cargando Bateria");
	}//cargarBateria
	

	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", nivelBateria=" + nivelBateria
				+ "]";
	}//toString
	
	
	
}//Robot
