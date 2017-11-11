package car;

public class NewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
        car1.carcompany;
        car1.carname;
        car1.model;
        car1.bodytype;
        car1.modelyear;
        car1.bhp;
        car1.transmissiontype;
        car1.noOfTransmission;
        car1.drivetype;
        car1.rimtype;
        car1.rimsize;
        car1.fueltankcapacity;
        car1.topspeed;
        car1.color1;
        car1.color2;
        car1.price;
        
        Car car2 = new Car("mclaren", 1230000, "sedan", "670S", "sport", "alloy", 560, "automatic" , 6 , 95, 20.00, black, red, 2017, "4wheeldrive" , 350);
        car2.carcompany;
        car2.price;
        car2.bodytype;
        car2.carname;
        car2.model;
        car2.rimtype;
        car2.bhp;
        car2.transmissiontype;
        car2.noOfTransmission;
        car2.fueltankcapacity;
        car2.rimsize;
        car2.color1;
        car2.color2;
        car2.modelyear;
        car2.drivetype;
        car2.topspeed;
        System.out.println("Car1");
        System.out.println(car1.carcompany);
        System.out.print(car1.carname);
        System.out.print(car1.model);
        System.out.print(car1.bodytype);
        System.out.print(car1.modelyear);
        System.out.print(car1.bhp);
        System.out.print(car1.transmissiontype);
        System.out.print(car1.noOfTransmission);
        System.out.print(car1.drivetype);
        System.out.print(car1.rimtype);
        System.out.print(car1.rimsize);
        System.out.print(car1.fueltankcapacity);
        System.out.print(car1.topspeed);
        System.out.print(car1.color1);
        System.out.print(car1.color2);
        System.out.print(car1.price);
        System.out.println("Car2");
        System.out.println(car2.carcompany);
        System.out.print(car2.carname);
        System.out.print(car2.model);
        System.out.print(car2.bodytype);
        System.out.print(car2.modelyear);
        System.out.print(car2.bhp);
        System.out.print(car2.transmissiontype);
        System.out.print(car2.noOfTransmission);
        System.out.print(car2.drivetype);
        System.out.print(car2.rimtype);
        System.out.print(car2.rimsize);
        System.out.print(car2.fueltankcapacity);
        System.out.print(car2.topspeed);
        System.out.print(car2.color1);
        System.out.print(car2.color2);
        System.out.print(car2.price);
	}

}
