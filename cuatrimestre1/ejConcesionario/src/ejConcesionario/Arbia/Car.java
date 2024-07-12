package ejConcesionario.Arbia;
import java.util.ArrayList;

public class Car {
	
	private String manufacturer;
	private String model;
	private int year;
	private String type;
	private String licensePlate;
	private Engine engine;
	
	
	public Car(String manufacturer, String model, int year, String type, String licensePlate, Engine engineCode) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.type = type;
		this.licensePlate = licensePlate;
		this.engine = engineCode;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void showDetail() {
		System.out.println("Marca: " + this.manufacturer);
		System.out.println("Modelo: " + this.model);
		System.out.println("Año: " + this.year);
		System.out.println("Tipo: " + this.type);
		System.out.println("Dominio: " + this.licensePlate);
		
	}
	
	public static void showListResume(ArrayList<Car> cars) {
		for(int x=0; x<cars.size(); x++) {
			System.out.println("---------");
			System.out.println("Marca: " + cars.get(x).manufacturer);
			System.out.println("Modelo: " + cars.get(x).model);
			System.out.println("Dominio: " + cars.get(x).licensePlate);
			System.out.println("");
			
		}
		
	}
	
	public static Car findByPlate(ArrayList<Car> cars, String licensePlate) {
///		Car foundCar;
		
		for(int x=0; x<cars.size(); x++) {
			if (cars.get(x).getLicensePlate() == licensePlate) {
				return cars.get(x);
			}
		}
		/*cars.forEach((currentCar) -> {
			if (currentCar.getLicensePlate() == licensePlate) {
				foundCar = currentCar;
			}
		});*/
		
		return null;
	}
	
	public static ArrayList<Car> findByGas(ArrayList<Car> cars, String gasType){
		
		ArrayList<Car> foundCars = new ArrayList<Car>();
		System.out.println("");
		System.out.println("Encontrados por: " + gasType);
		
		for(int x=0; x<cars.size(); x++) {
			
			Car currentCar = cars.get(x);
			if (currentCar.getEngine().getGasType() == gasType) {
				foundCars.add(currentCar);
			}
		}
		
		return foundCars;
	}
	
	public static ArrayList<Car> findByManufacturer(ArrayList<Car> cars, String manufacturer){
		ArrayList<Car> foundCars = new ArrayList<Car>();
		System.out.println("");
		System.out.println("Encontrados por: " + manufacturer);
		for(int x=0; x<cars.size(); x++) {
			if (cars.get(x).getManufacturer() == manufacturer) {
				foundCars.add(cars.get(x));
			}
		}
		
		return foundCars;
	}
	
	public static ArrayList<Car> findByType(ArrayList<Car> cars, String type){
		ArrayList<Car> foundCars = new ArrayList<Car>();
		for(int x=0; x<cars.size(); x++) {
			if (cars.get(x).getType() == type) {
				foundCars.add(cars.get(x));
			}
		}
		
		return foundCars;
	}
	
	
	
	
}
