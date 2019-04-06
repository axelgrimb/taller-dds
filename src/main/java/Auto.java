
public class Auto {
	Estado estado;
	int velocidad;
	int temperatura;
	double combustible;
	
	public void encender() {
		try{
			this.temperatura+=70;
			this.combustible=(0.001/100)*this.combustible;
		}
		catch (Exception e) {
			throw new YaEncendidoException();
		}
	}
	
	public void apagar() {
		try{
			
		}
		catch (Exception e) {
			throw new YaApagadoException();
		}
	}
	
	public void acelerar(int kph) {
		this.velocidad+=kph;
		this.temperatura+=0.2*kph;
	}
	
	public void detener(int kph) {
		this.temperatura+=0.4*this.velocidad;
		this.velocidad=0;
		
	}
}
