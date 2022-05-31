package modelos;

public class CalcularPeso {
	
	private static final double GRAVEDAD_MERCURIO = 3.7;
	private static final double GRAVEDAD_VENUS = 8.87;
	private static final double GRAVEDAD_TIERRA = 9.8;
	private static final double GRAVEDAD_MARTE = 3.721;
	private static final double GRAVEDAD_JUPITER = 24.79;
	private static final double GRAVEDAD_SATURNO = 10.44;
	private static final double GRAVEDAD_URANO  = 8.87;
	private static final double GRAVEDAD_NEPTUNO = 11.15;
	private static final double GRAVEDAD_PLUTON = 0.62;
	
	public static String cualquierPlaneta(String planeta, double peso) {
		
		
		if(planeta.equals("Tierra")) {
			
			return "Tu peso en la Tierra es de: " + peso + " Kg";
			
		} else {
			
			double gravedadPlaneta = CalcularPeso.obtenerGravedad(planeta);
			
			double respuesta = (gravedadPlaneta  * peso) / GRAVEDAD_TIERRA;
			
			return "tu peso en " + planeta + " es de " + respuesta + " Kg";
			
		}
		
	}
	
	
	public static double obtenerGravedad(String planeta) {
		
		
		if(planeta.equals("Mercurio")){
			
			return GRAVEDAD_MERCURIO;
			
		}
		
		
		if(planeta.equals("Venus")){
			
			return GRAVEDAD_VENUS;
			
		}
		
		
		if(planeta.equals("Marte")){
			
			return GRAVEDAD_MARTE;
			
		}
		
		if(planeta.equals("Jupiter")){
			
			return GRAVEDAD_JUPITER;
			
		}
		
		if(planeta.equals("Saturno")){
			
			return GRAVEDAD_SATURNO;
			
		}
		
		if(planeta.equals("Urano")){
			
			return GRAVEDAD_URANO;
			
		}
		
		if(planeta.equals("Neptuno")){
			
			return GRAVEDAD_NEPTUNO;
			
		}
		
		if(planeta.equals("Pluton")){
			
			return GRAVEDAD_PLUTON;
		}
		
		return 0.0;
		
	}
	
	

}
