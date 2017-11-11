
public class Cars {
	 String carcompany;
     String carname;
     int horsepower;
     int price;
     String bodytype;
     String model;
     String rimtype;
     double bhp;
     String transmissiontype;
     int noOfTransmission;
     double fueltankcapacity;
     double rimsize;
     String color1;
     String color2;
     int modelyear;
     String drivetype;
     double topspeed;
     double timeToReach100kph;
     int mpg ;
     String engine;
     int torque;
     int rmp;
     int basicWarrenty;
     double weight;
     double timeToReach200kph;
     double maxspeedkph;
     double timetoreachmaxspeed;
     
     Cars(){
         carcompany = "audi";
   carname = " R8";
   horsepower = 610;
      price = 165000 ;
      bodytype = "coupe";
      model = "4.2 FSI";
      rimtype = " alloy rim ";
     bhp = 420.00 ;
      transmissiontype = " manual ";
      noOfTransmission = 6;
     fueltankcapacity = 19.3;
      rimsize = 18 ;
      color1 = " black ";
      color2 = " white ";
      modelyear = 2015;
      drivetype = " fourWheelDrive ";
      topspeed = 301;
      engine = "Premium Unleaded V-10";
     torque = 413;
     rmp = 7800;
      timeToReach100kph = 2.8;
      mpg = 14;
      weight = 3627;
      timeToReach200kph = 9.1;
   
 }
     
   
 Cars( String carcompany, int price, int horsepower, String bodytype, String carname, String model, String rimtype, double bhp, String transmissiontype, int noOfTransmission, int fueltankcapacity, double rimsize, String color1, String color2, int modelyear, String drivetype, double topspeed, double timeToReach60, int mpg, int weight,int basicWarrenty, String engine, int torque, int rmp, double timeToReach200kph ){
  this.carcompany  = carcompany;
  this.price = price;
  this.horsepower = horsepower;
  this.bodytype = bodytype ;
  this.carname = carname;
  this.model = model;
  this.rimtype = rimtype;
  this.bhp = bhp;
  this.transmissiontype = transmissiontype;
  this.noOfTransmission = noOfTransmission ;
  this.fueltankcapacity = fueltankcapacity ;
  this.rimsize = rimsize ;
  this.color1 = color1 ;
  this.color2 = color2;
  this.modelyear = modelyear ;
  this.drivetype = drivetype ;
  this.topspeed = topspeed;
  this.timeToReach100kph = timeToReach100kph;
  this.mpg = mpg;
  this.weight = weight;
  this.basicWarrenty = basicWarrenty;
  this.engine = engine;
  this.torque = torque;
  this.rmp = rmp;
  this.timeToReach200kph = timeToReach200kph;

 } 


}
