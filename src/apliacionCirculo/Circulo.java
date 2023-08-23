package apliacionCirculo;

public class Circulo {
    private double radio; 
    
	public Circulo() {
		radio=1.0;
     
	}
	
	public Circulo(double radio) {
		this.radio=radio;             //el operador this me sirve para referirme al elemento de la clase
	}

	public double getRadio() {
		return radio;                  //return significa retornar o devolver
	}
	
	public void setRadio(double radio) {          // set es asignar 
		this.radio = radio;
	}

	 public double getArea() {
		 double miArea=Math.PI*Math.pow(this.radio,2);
		 return miArea;
	 }
	
	 public double getCircunferencia() {
		 double circunferencia=2*this.radio;
		 return circunferencia;
	 }

	@Override                                       //overrride es sobre escritura de metodoos
	public String toString() {
		return " mi Circulo  tiene un radio de " + radio + " gracias ";
	}
	
	
	}
	


