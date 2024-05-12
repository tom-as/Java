package ejConcesionario.Arbia;

public class Engine {

	private String gasType;
	private String displacement;
	private String engineCode;
	
	
	public Engine(String gasType, String displacement, String engineCode) {
		super();
		this.gasType = gasType;
		this.displacement = displacement;
		this.engineCode = engineCode;
	}
	
	public String getGasType() {
		return gasType;
	}
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getEngineCode() {
		return engineCode;
	}
	public void setEngineCode(String engineCode) {
		this.engineCode = engineCode;
	}
	
	

}
