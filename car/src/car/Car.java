package car;

public class Car {
	 String carcompany;
     String carname;
     int price;
     String bodytype;
     String model;
     String rimtype;
     int bhp;
     String transmissiontype;
     int noOfTransmission;
     int fueltankcapacity;
     double rimsize;
     String color1;
     String color2;
     int modelyear;
     String drivetype;
     double topspeed; 
 
  
   Car(){
   carcompany = "audi";
   carname = " R8";
      price = 165000 ;
      bodytype = "coupe";
      model = "4.2 FSI";
      rimtype = " alloy rim ";
     bhp = 420 ;
      transmissiontype = " manual ";
      noOfTransmission = 6;
     fueltankcapacity = 90;
      rimsize = 18 ;
      color1 = " black ";
      color2 = " white ";
      modelyear = 2015;
      drivetype = " fourWheelDrive ";
      topspeed = 301;    
 }
 Car( "carcompany", price, "bodytype", "carname", "model", "rimtype", bhp, "transmissiontype" noOfTransmission, fueltankcapacity, rimsize, "color1", "color2", modelyear, "drivetype", topspeed){
  this.carcompany  = carcompany;
  this.price = price;
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
  
 }
}
