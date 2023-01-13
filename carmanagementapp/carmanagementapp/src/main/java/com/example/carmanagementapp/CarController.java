package com.example.carmanagementapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {
	@Autowired
	private CarRepository carrepository;
	
	@GetMapping("/getCars")
	public List<Car> allCars(){
		return carrepository.findAll();
	}
	
	@GetMapping("/getCar")
	public List<Car> getCar(@RequestParam String carid){
		return carrepository.findByCarid(carid);
	}
	
	@GetMapping("/saveCar")
	@ResponseBody
	public String addCar() {
		
		String carid = "12211";
		String carmodel = "baleno";
		String carno = "TN 38 CJ 6636";
		String status = "available";
		
		Car cout = new Car(carid,carmodel,carno,status);
		carrepository.save(cout);
		System.out.println("----------All Data saved into Database--------------");
		return "[{status:inserted}]";
	}
	
	@GetMapping("/editCar")
	public String editCar(@RequestParam String carid) {
		String carmodel = "Verna";
		String carno = "TN 33 DD JJJJ";
		String status = "booked";
		
		Car cout = new Car(carid,carmodel,carno,status);
		carrepository.save(cout);
		return "[{status:edited}]";
	}
	
	@GetMapping("/deleteCar")
	public String deleteByCarid(@RequestParam String carid) {
		System.out.println("carid"+carid);
		try {
       carrepository.deleteByCarid(carid);
		}catch(Exception ex) {
			System.out.println(ex);
		}
       return "[{status:deleted}]";
	}
}
