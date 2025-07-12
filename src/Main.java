import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Iniciamos el Scanner para tener datos del teclado
		Scanner keyboard = new Scanner(System.in);
		
		//Creamos instancias para continuar interactuando con la interfaz
		int continuaMenuRobots = 1;
		int continuaMenuRobot = 1;
		
		//Seleccion de Menu del robot;
		int seleccionMenu = 1;
		
		//Creamos instancias de cada robot
		RobotTerrestre robotTerrestre = new RobotTerrestre();
		RobotSubmarino robotSubmarino = new RobotSubmarino();
		RobotAnfibio robotAnfibio = new RobotAnfibio();
		
		do{
			switch(robotChoiceMenu(keyboard)){
				
				case 1:
					do {
						System.out.println("El robot seleccionado es : " + robotTerrestre.getNombre());
						seleccionMenu = robotManipulationMenu(keyboard, robotTerrestre);
						
						switch(seleccionMenu){
							case 1:
								System.out.print("Ingresa la altura del robot: ");
								robotTerrestre.setAltura(keyboard.nextInt());
								
								System.out.print("Ingresa el peso del robot: ");
								robotTerrestre.setPeso(keyboard.nextInt());
								
								System.out.print("Ingresa el nivel de bateria: ");
								robotTerrestre.setNivelBateria(keyboard.nextInt());
								
								System.out.println("Ingresa el numero de motores: ");
								robotTerrestre.setMotores(keyboard.nextInt());
								
								System.out.println("Ingresa la velocidad: ");
								robotTerrestre.setVelocidad(keyboard.nextInt());
								break;
								
							case 2:
								System.out.println("Cracterísticas del " + robotTerrestre.getNombre() + ":");
								System.out.println("Altura: " + robotTerrestre.getAltura());
								System.out.println("Peso: " + robotTerrestre.getPeso());
								System.out.println("Nivel de Bateria: " + robotTerrestre.getNivelBateria() + "%");
								System.out.println("Número de motores: " + robotTerrestre.getMotores());
								System.out.println("Velocidad: " + robotTerrestre.getVelocidad());
								break;
							
							case 3:
								robotTerrestre.rodando();
								break;
							
							case 4:
								robotTerrestre.cargarBateria();
								break;
							default:
								System.out.println("Escoge un número válido.");
						}//switch
						System.out.println("Quieres continuar con este robot? (Ingresa 1 para si/ 2  para no):");
						continuaMenuRobot = keyboard.nextInt();
					}while(continuaMenuRobot == 1);
				
				break;
				
				case 2:
					do {
						System.out.println("El robot seleccionado es : " + robotSubmarino.getNombre());
						seleccionMenu = robotManipulationMenu(keyboard, robotSubmarino);
						
						switch(seleccionMenu){
							case 1:
								System.out.print("Ingresa la altura del robot: ");
								robotSubmarino.setAltura(keyboard.nextInt());
								
								System.out.print("Ingresa el peso del robot: ");
								robotSubmarino.setPeso(keyboard.nextInt());
								
								System.out.print("Ingresa el nivel de bateria: ");
								robotSubmarino.setNivelBateria(keyboard.nextInt());
								
								System.out.println("Ingresa el numero de helices: ");
								robotSubmarino.setHelices(keyboard.nextInt());
								
								System.out.println("Ingresa la profundidad máxima: ");
								robotSubmarino.setProfundidad(keyboard.nextInt());
								break;
								
							case 2:
								System.out.println("Cracterísticas del " + robotSubmarino.getNombre() + ":");
								System.out.println("Altura: " + robotSubmarino.getAltura());
								System.out.println("Peso: " + robotSubmarino.getPeso());
								System.out.println("Nivel de Bateria: " + robotSubmarino.getNivelBateria() + "%");
								System.out.println("Número de helices: " + robotSubmarino.getHelices());
								System.out.println("Profuncidad máxima: " + robotSubmarino.getProfundidad());
								break;
							
							case 3:
								robotSubmarino.navegando();
								break;
							
							case 4:
								robotSubmarino.cargarBateria();
								break;
							default:
								System.out.println("Escoge un número válido.");
						}//switch
						System.out.println("Quieres continuar con este robot? (Ingresa 1 para si/ 2  para no):");
						continuaMenuRobot = keyboard.nextInt();
					}while(continuaMenuRobot == 1);
				
				break;
				
				case 3:
					do {
						System.out.println("El robot seleccionado es : " + robotAnfibio.getNombre());
						seleccionMenu = robotManipulationMenu(keyboard, robotAnfibio);
						
						switch(seleccionMenu){
							case 1:
								System.out.print("Ingresa la altura del robot: ");
								robotAnfibio.setAltura(keyboard.nextInt());
								
								System.out.print("Ingresa el peso del robot: ");
								robotAnfibio.setPeso(keyboard.nextInt());
								
								System.out.print("Ingresa el nivel de bateria: ");
								robotAnfibio.setNivelBateria(keyboard.nextInt());
								
								System.out.println("Ingresa el numero de motores: ");
								robotAnfibio.setMotores(keyboard.nextInt());
								
								System.out.println("Ingresa el numero de helices: ");
								robotAnfibio.setHelices(keyboard.nextInt());
								
								System.out.println("Ingresa la velocidad: ");
								robotAnfibio.setVelocidad(keyboard.nextInt());
								
								System.out.println("Ingresa la profundidad máxima: ");
								robotAnfibio.setProfundidad(keyboard.nextInt());
								
								System.out.println("El robot navegando? (true/false):");
								robotAnfibio.setNavegando(keyboard.nextBoolean());
								break;
								
							case 2:
								System.out.println("Cracterísticas del " + robotAnfibio.getNombre() + ":");
								System.out.println("Altura: " + robotAnfibio.getAltura());
								System.out.println("Peso: " + robotAnfibio.getPeso());
								System.out.println("Nivel de Bateria: " + robotAnfibio.getNivelBateria() + "%");
								System.out.println("Número de motores: " + robotAnfibio.getMotores());
								System.out.println("Número de helices: " + robotAnfibio.getHelices());
								System.out.println("Velocidad: " + robotAnfibio.getVelocidad());
								System.out.println("Profuncidad máxima: " + robotAnfibio.getProfundidad());
								break;
							
							case 3:
								if(robotAnfibio.isNavegando()){
									robotAnfibio.navegando();
								}else {
									robotAnfibio.rodando();
								}
								break;
							
							case 4:
								robotAnfibio.cargarBateria();
								break;
							default:
								System.out.println("Por favor, escoge un número válido.");
						}//switch
						System.out.println("Quieres continuar con este robot? (Ingresa 1 para si/ 2  para no):");
						continuaMenuRobot = keyboard.nextInt();
					}while(continuaMenuRobot == 1);
				break;
				
				default:
					System.out.println("Por favor, escoge un robot válido.");
			}//switch
			
			System.out.println("Quieres continuar con la selección de robots? (Ingresa 1 para si/ 2  para no): ");
			continuaMenuRobots = keyboard.nextInt();
		}while(continuaMenuRobots == 1);
		
		System.out.println("Saliendo del Menu de Selección de Robots");

	}//main
	
	public static int robotChoiceMenu(Scanner keyboard){
		
		int seleccionPorUsuario;
		System.out.println("****** ROBOT MENU ******");
		System.out.println("1. Robot Terrestre");
		System.out.println("2. Robot Submarino");
		System.out.println("3. Robot Anfibio");
		System.out.print("Escoge una opción entre el (1-3): ");
		seleccionPorUsuario = keyboard.nextInt();
		System.out.println();
		return seleccionPorUsuario;
	}//robotChoiceMenu

	public static int robotManipulationMenu(Scanner keyboard, Robot robot){
	
		int seleccionPorUsuario;
		System.out.println("****** Menu de detalles del robot: " + robot.getNombre() + " ******");
		System.out.println("1. Configurar características");
		System.out.println("2. Mostrar características");
		System.out.println("3. Mover Robot");
		System.out.println("4. Cargar bateria del robot");
		System.out.print("Escoge una opción entre el (1-4): ");
		seleccionPorUsuario = keyboard.nextInt();
		System.out.println();
		return seleccionPorUsuario;
	}//robotManipulationMenu
}//Main
