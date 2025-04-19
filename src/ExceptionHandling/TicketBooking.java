package ExceptionHandling;

 class PersonDetails{
    String customerName;
   private int customerAge;
   private String custmerEmail;
   private String customerPhoneNum;



    public void setCustomerAge(int customerAge){
      this.customerAge=customerAge;
  }
  public int getCustomerAge(){
      return customerAge;
  }

  public void setCustmerEmail(String custmerEmail){
      this.custmerEmail=custmerEmail;
  }
  public String getCustmerEmail(){
      return this.custmerEmail;
  }
  public void setCustomerPhoneNum(String customerPhoneNum){
      this.customerPhoneNum=customerPhoneNum;
  }
  public String getCustomerPhoneNum(){
      return customerPhoneNum;
  }

   public PersonDetails(){


   }

   public PersonDetails(String customerName,int customerAge,String custmerEmail,String customerPhoneNum){






      if(customerName=="" || customerName.isEmpty()){
          throw new IllegalArgumentException("Customer names is null or empty");
      }
      if(customerAge<=12){
          throw new IllegalArgumentException("You didn't book in the ticket");
      }

      if(custmerEmail==" " || custmerEmail.isEmpty()){
          throw new IllegalArgumentException("Customer email is empty or null");
      }

      String emailRegex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

      if(!custmerEmail.matches(emailRegex)){
          throw new IllegalArgumentException("Customer email is Invalid");
      }

      if(customerPhoneNum.isEmpty() || customerPhoneNum==null){
          throw new IllegalArgumentException("Customer phonenumber is empty or null");

      }

       // Ensure phone number contains only digits

      if(!customerPhoneNum.matches("\\d+")){
          throw new IllegalArgumentException("Phone number is must contain only numbers");
      }

      if(!customerPhoneNum.matches("^[6-9]\\d{9}$")){
          throw new IllegalArgumentException("Invalid phone number format(must be 10 digits starting with 6-9)");
      }

      this.customerName=customerName;
      this.customerAge=customerAge;
      this.custmerEmail=custmerEmail;
      this.customerPhoneNum=customerPhoneNum;

   }

    public  void printCustomerDetails(){

        System.out.println("Customer Name: "+this.customerName);
        System.out.println("customer Age: "+customerAge);
        System.out.println("customer Email: "+custmerEmail);
        System.out.println("cutomer PhoneNumber: "+customerPhoneNum);
    }


}



public class TicketBooking {
    public static void main(String[] args) {


        try{
            PersonDetails cusDetails=new PersonDetails( "" , 22 , "madasamdjy@gmail.com","9598769876");
            cusDetails.printCustomerDetails();
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        finally {
            System.out.println("You continue to book ");
        }

    }
}
