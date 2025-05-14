/* Write a java program to illustrate multilevel inheritance such that state is inherited from state display city state and countray. write constructor,appropriate setter and getter methods.*/
 class Country
 {

         private String countryName;
        // Default constructor 
        public Country( )
        {
             this.countryName = " ";
         }
        // Parametrized constructor 
       public Country(String name)
       {
             this.countryName = name;
        }
       // Setter method 
        public void setCountry(String name)
       {
              this.countryName = name;
         }

        //Getter method 
         public String getCountry()
         {
               return this.countryName;
          }
}
class State extends Country
{
      private String StateName;
      
       // Default constructor
        public State()
       {
               super();
               this.StateName = " ";
        }
       // Patametrized constructor 
       public State(String countryName, String stateName)
       {
              super(countryName);
              this.StateName = stateName;
        }
        // setter method
        public void setState(String name)
         {
                this.StateName = name;
          }
        public String getState()
       {
             return this.StateName;
         }
   }
class City extends State 
{
      private String cityName;
      // Default constructor 
      public City()
      {
             super();
             this.cityName = "";
         }
       // Patameterized constructor 
         public City(String countryName,String stateName, String cityName)
        {
               super(countryName, stateName);
               this.cityName = cityName;
          }
        // Setter method
         public void setCity(String name)
          {
                 this.cityName = name;
            }
        // Getter method
        public String getCity()
          {
                return this.cityName;
           }
         
         // Display
        public void display()
         {
               System.out.println("Country: " + getCountry());
               System.out.println("State: " + getState());
               System.out.println("CCity: " + getCity());
           }
}
class Multi_inherit
{
        public static void main(String[] args)
         {
                City c = new City("India", "Maharashtra","pune");
                  
                c.display();
           }
} 

          


      




