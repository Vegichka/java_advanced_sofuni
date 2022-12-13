package class_defying;

public class Car {
   private String model;
   private String brand;
   private int horsePower;

   public Car(String brand, String model, int horsePower) {
    this.brand = brand;
    this.model = model;
    this.horsePower = horsePower;
}

public Car(String brand) {
    this(brand, "unknown", -1);
}
   public String getBrand() {
       return brand;
   }
   public void setBrand(String brand) {
       this.brand = brand;
   }
   public int getHorsePower() {
       return horsePower;
   }
   public void setHorsePower(int horsePower) {
       this.horsePower = horsePower;
   }
   public String getModel() {
       return model;
   }
   public void setModel(String model) {
       this.model = model;
   }
   public String carInfo(){
    return String.format("The car is: %s %s - %d HP.", 
    getBrand(), getModel(), getHorsePower());
   }

   //public boolean equals(Car other){
    //return 
      //     this.brand.equals(other.brand)
        //&& this.model.equals(other.model)
        //&& this.horsePower == horsePower;
        //}
    }

