
public class RobotAnfibio extends Robot implements Navegar, Rodar{
	
	private int motores;
	private int helices;
	private int velocidad;
	private int profundidad;
	private boolean isNavegando;
	
	public RobotAnfibio() {
		super("Robot Anfibio");
	}//RobotAnfibio

	public int getMotores() {
		return motores;
	}//getMotores

	public void setMotores(int motores) {
		this.motores = motores;
	}//setMotores

	public int getHelices() {
		return helices;
	}//getHelices

	public void setHelices(int helices) {
		this.helices = helices;
	}//setHelices

	public int getVelocidad() {
		return velocidad;
	}//getVelocidad

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}//setVelocidad

	public int getProfundidad() {
		return profundidad;
	}//getProfundidad

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}//setProfundidad
	
	public boolean isNavegando() {
		return isNavegando;
	}//isNavegando

	public void setNavegando(boolean isNavegando) {
		this.isNavegando = isNavegando;
	}//setNavegando

	@Override
	public String toString() {
		return "RobotAnfibio [motores=" + motores + ", helices=" + helices + ", velocidad=" + velocidad
				+ ", profundidad=" + profundidad + "]";
	}//toString

	@Override
	public void rodando() {
		System.out.println("El robot " + getNombre() + " esta caminando.");
	}//rodando

	@Override
	public void navegando() {
		System.out.println("El robot " + getNombre() + " esta navegando.");
	}//mavegando
	
}//RobotAnfibio
