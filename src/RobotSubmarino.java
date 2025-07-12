
public class RobotSubmarino extends Robot implements Navegar{
	
	private int helices;
	private int profundidad;
	
	public RobotSubmarino() {
		super("Robot Submarino");
	}//RobotSubamarino

	public int getHelices() {
		return helices;
	}//getHelices

	public void setHelices(int helices) {
		this.helices = helices;
	}//setHelices

	public int getProfundidad() {
		return profundidad;
	}//getProfundidad

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}//setProfundidad

	@Override
	public String toString() {
		return "RobotSubmario [helices=" + helices + ", profundidad=" + profundidad + "]";
	}//toString

	@Override
	public void navegando() {
		System.out.println("El robot: " + getNombre() + " esta navegando.");
	}//navegando
	
	
}//RobotSubmarino
