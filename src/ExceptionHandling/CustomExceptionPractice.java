package ExceptionHandling;


class InvalidProductException extends Exception{
    public InvalidProductException (String message){
        super(message);
    }

}

class Product{
    String carName;
    int carPrice;
    float carMileage;


    public Product(){

    }

    public  Product(String carName,int carPrice,float carMileage) throws InvalidProductException{


        // validation

        if(carName==""){
            throw new InvalidProductException("car name is empty or null");
        }

        if(carPrice<=0){
            throw new InvalidProductException("Car price is must greater than zero");

        }
        if(carMileage<=0){
            throw new InvalidProductException("Car mileage is must greater than zer0");

        }


        this.carName=carName;
        this.carMileage=carMileage;
        this.carPrice=carPrice;

    }

    public void displayProduct(){
        System.out.println("Car Name: "+carName);
        System.out.println("Car Mileage: "+carMileage);
        System.out.println("Car Price: "+carPrice);
    }






}



public class CustomExceptionPractice  {
    public static void main(String[] args) {

      try{
          Product car1=new Product("",2200000,22.5f);
          car1.displayProduct();
      }
      catch(InvalidProductException e){
          System.out.println("Error: "+e.getMessage());
          e.printStackTrace();

        }
      finally{
          System.out.println("Completed details");
      }

    }
}
