
public class Car2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Cars car1 = new Cars();
	        car1.carcompany = "Audi";
	        car1.carname = "r8";
	        car1.model = "4.2fsi";
	        car1.bodytype = "convertible";
	        car1.modelyear = 2016;
	        car1.bhp = 420;
	        car1.transmissiontype = "automatic";
	        car1.noOfTransmission = 7;
	        car1.drivetype = "4wd";
	        car1.rimtype = "alloy";
	        car1.rimsize = 18.00;
	        car1.fueltankcapacity = 19;
	        car1.topspeed = 301.00;
	        car1.color1 = "black";
	        car1.color2 = " silver";
	        car1.price = 165000;
	        car1.timeToReach100kph = 2.9;
	        car1.timeToReach200kph =7.9;
	        car1.engine = "Premium Unleaded V-10";
	        car1.torque = 413;
	        car1.rmp = 7800;
	         car1.mpg = 14;
	         car1.weight = 3627;
	        
	         Cars car2 = new Cars("mclaren", 350000, 675 , "coupe", "675lt", "spider", "alloy", 560, "automatic" , 7 , 19, 20.00, "black", "red", 2017, "rwd" , 350, 2.9, 16, 2927, 50000, "Twin Turbo Premium Unleaded V-8", 700, 7100,7.9);
	        car2.carcompany = "mclaren";
	        car2.carname = "675LT";
	        car2.horsepower = 670;
	        car2.model = "spider";
	        car2.bodytype = "coupe";
	        car2.modelyear = 2016;
	        car2.bhp = 420;
	        car2.transmissiontype = "automatic";
	        car2.noOfTransmission = 7;
	        car2.drivetype = "rwd";
	        car2.rimtype = "alloy";
	        car2.rimsize = 20.00;
	        car2.fueltankcapacity = 19;
	        car2.topspeed = 330.00;
	        car2.color1 = "black";
	        car2.color2 = " red";
	        car2.price = 350000;
	        car2.engine = "Premium Unleaded V-10";
	        car2.torque = 413;
	        car2.rmp = 7800;
	        car2.timeToReach100kph = 2.9;
	        car2.timeToReach200kph =7.9;
	        car2.mpg = 14;
	        car2.weight = 3627;
	        
	        System.out.println("__________Car1_________");
	        System.out.println("car manufacturer    :" + car1.carcompany);
	        System.out.println("car name            :" +car1.carname);
	        System.out.println("car model           :" +  car1.model);
	        System.out.println("car bodytype        :" + car1.bodytype);
	        System.out.println("car weight          :" + car1.weight);
	        System.out.println("car model year      :" + car1.modelyear);
	        System.out.println("car engine          :" + car1.engine);
	        System.out.println("car torque          :" + car1.torque);
	        System.out.println("car rmp             :" + car1.rmp);
	        System.out.println("car horsepower      :" + car1.horsepower);
	        System.out.println("car brakehorsepower :" + car1.bhp);
	        System.out.println("transmissiontype    :" + car1.transmissiontype);
	        System.out.println("no of transmission  :" + car1.noOfTransmission);
	        System.out.println("car drive type      :" + car1.drivetype);
	        System.out.println("rimtype             :" + car1.rimtype);
	        System.out.println("rimsize             :" + car1.rimsize);
	        System.out.println("mile per galon      :" + car1.mpg);
	        System.out.println("car model year      :" + car1.modelyear);
	        System.out.println("topspeed            :" + car1.topspeed);
	        System.out.println("color 1             :" + car1.color1);
	        System.out.println("color 2             :" + car1.color2);
	        System.out.println("car price           :" + car1.price);
	        System.out.println("time to reach 0-100kph    :" + car1.timeToReach100kph);
	        System.out.println("time to reach 0-200kph    :" + car1.timeToReach200kph);
	        System.out.println("_________Car2_____________");
	        System.out.println("car manufacturer    :" + car2.carcompany);
	        System.out.println("car name            :" +car2.carname);
	        System.out.println("car model           :" +  car2.model);
	        System.out.println("car bodytype        :" + car2.bodytype);
	        System.out.println("car weight          :" + car2.weight);
	        System.out.println("car model year      :" + car2.modelyear);
	        System.out.println("car engine          :" + car2.engine);
	        System.out.println("car torque          :" + car2.torque);
	        System.out.println("car rmp             :" + car2.rmp);
	        System.out.println("car horsepower      :" + car2.horsepower);
	        System.out.println("car brakehorsepower :" + car2.bhp);
	        System.out.println("transmissiontype    :" + car2.transmissiontype);
	        System.out.println("no of transmission  :" + car2.noOfTransmission);
	        System.out.println("car drive type      :" + car2.drivetype);
	        System.out.println("rimtype             :" + car2.rimtype);
	        System.out.println("rimsize             :" + car2.rimsize);
	        System.out.println("mile per galon      :" + car2.mpg);
	        System.out.println("topspeed            :" + car2.topspeed);
	        System.out.println("color 1             :" + car2.color1);
	        System.out.println("color 2             :" + car2.color2);
	        System.out.println("car price           :" + car2.price);
	        System.out.println("time to reach 0-100kph    :" + car2.timeToReach100kph);
	        System.out.println("time to reach 0-200kph    :" + car2.timeToReach200kph);
	        System.out.println("____________________Comparasion of cars_______________________");
	        System.out.println("car company and name          :" + car1.carcompany + " " + car1.carname + "________________________" + car2.carcompany  + " " + car2.carname);
	        System.out.println("car model and year            :" + car1.model + " " + car1.modelyear + "____________________" + car2.model + " " + car2.modelyear);
	        System.out.println("car enginetype                :" +car1.engine + "__________" + car2.engine);
	        System.out.println("car torque                    :" +car1.torque + "torque______________________" + car2.torque + "torque");
	        System.out.println("car rmp                       :" +car1.rmp + "rmp________________________" + car2.rmp + "rmp");
	        System.out.println("car mile per galon            :" +car1.mpg + "mpg__________________________" + car2.mpg + "mpg" );
	        System.out.println("car horsepower                :" +car1.horsepower + "____________________________" + car2.horsepower);
	        System.out.println("car transmissionType          :" +car1.transmissiontype + "______________________" + car2.transmissiontype);
	        System.out.println("car noOfTransmission          :" +car1.noOfTransmission + "transmission__________________" + car2.noOfTransmission + "transmission");
	        System.out.println("car body and drivetype        :" + car1.bodytype + "&" + car1.drivetype + "________________" + car2.bodytype + " & " + car2.drivetype);
	        System.out.println("car rimtype and rimsize       :" +car1.rimtype + " & " + car1.rimsize + "___________________" + car2.rimtype + " & " + car2.rimsize);
	        System.out.println("car color                     :" +car1.color1 + " & " + car1.color2 + "________________" + car2.color1 + " & " + car2.color2);
	        System.out.println("car topspeed                  :" +car1.topspeed + "__________________________" + car2.topspeed);
	        System.out.println("car time to reach 0-100kph    :" +car1.timeToReach100kph + "____________________________"  + car2.timeToReach100kph);
	        System.out.println("car time to reach 0-200kph    :" +car1.timeToReach200kph + "____________________________"  + car2.timeToReach200kph);
	}

}
