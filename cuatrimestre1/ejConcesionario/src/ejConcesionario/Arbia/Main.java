package ejConcesionario.Arbia;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Engine engine1 = new Engine("Nafta", "3000", "2JZ");
		Engine engine2 = new Engine("Nafta", "1800", "AGU");
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		Car car1 = new Car("Toyotorta", "Supra", 1996, "Coupe", "ZZZ300", engine1);

		Car car2 = new Car("VW", "Golf", 2001, "Hatchback", "DOT427", engine2);
		Car car3 = new Car("Audi", "A3", 2003, "Hatchback", "SSS420", engine2);
		
		carList.add(car1); 
		carList.add(car2);
		carList.add(car3);
		
		///Buscar por patente y mostrar		
		Car foundCar1 = Car.findByPlate(carList, "ZZZ300");
		foundCar1.showDetail();
		///
		
		//Buscar por combustible y mostrar resumen
		ArrayList<Car> foundCars = Car.findByGas(carList, "Nafta");
		Car.showListResume(foundCars);
		/// Buscar por marca y mostrar resumen
		ArrayList<Car> foundCars2 = Car.findByManufacturer(carList, "Audi");
		Car.showListResume(foundCars2);
		///
		/// Buscar por tipo y mostrar resumen
		ArrayList<Car> foundCars3 = Car.findByType(carList, "Coupe");
		Car.showListResume(foundCars3);
		///
		
		
		
		System.out.println("corrio");
		
		

	}

}
