
public abstract class Poligono extends Figura{

	double base;
	double altura;

	public Poligono(double area) {
		super(area);
	}
	
	public double base() {
		return this.base;
	}
	
	public double altura() {
		return this.altura;
	}
	

}
