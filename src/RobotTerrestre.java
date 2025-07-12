
public class RobotTerrestre extends Robot implements Rodar{
	
	private int motores;
	private int velocidad;
	
	public RobotTerrestre(){
		super("Robot Terrestre");
	}//RobotTerrestre

	public int getMotores() {
		return motores;
	}//getMotores

	public void setMotores(int motores) {
		this.motores = motores;
	}//setMotores

	public int getVelocidad() {
		return velocidad;
	}//getVelocidad

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}//setVelocidad

	@Override
	public String toString() {
		return "RobotTerrestre [motores=" + motores + ", velocidad=" + velocidad + "]";
	}//toString
	
	public void rodando(){
		System.out.println("El robot " + getNombre() + " esta caminando.");
	}//rodando
	
	
}//RobotTerrestre
