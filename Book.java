class Book 
{
    private author;
    public   Book()
     {
          this.author = "XYZ";
     }
    public Book(String name)
     { 
         this.author = name;
      }
    public void display()
     {
         System.out.println(" Author name :" + this.author);
      }
  }
    
class Paperpublication extends Book 
    {
        private title;
   
     public Paperpublication()
    {
          super();
         this.title = "abc"
    }
    public Paperpublication( String author , String Title)
    {
         super(author);
         this.title = Title;
    }
    public void display()
     {
          super.display();
          System.out.println(" publication_of_Paper :" + this.title);
      }
}
class Bookpublication extends Book 
{
    private title;
  
   public Bookpublication()
   {
        super();
        this.title = "pqr";
    }
   public Bookpublication(String author,String Title)
   {
        super(author);
        this.title = Title;
     }
  public void display()
   {
        super.display();
        System.out.println(" publication_of_Paper : " + this.tile);
    }
}
class main{
        public static void main(String[] args)
       { Scanner sc = new Scanner(System.in);
         System.out.println("How many books : ");
         int n=sc.nextInt();

         Book b[]= new Book[n];
         
         for(int i=0; i<n; i++){
                 String author=sc.nextLine(); // to get data from buffer
                 String.out.println("Enter author name : ");
                 author=sc.nextLine();  
                 String.out.println("Enter type of publication (book / paper) : ");
                 String type=sc.nextLine();
                 System.out.println("Enter Title : ");
                 Sting title= sc.nextLine();
                 if (type.equals("book"))
                          b[i] = new Bookpublication(author,title);
                 else 
                      if  (type.equals("paper"))
                                 b[i]= new Paperpublication(author,title);
                      else  
                             {
                              System.out.println("Invalid publication type ");
                              i--;
                              }
                }//end of for
                 System.out.println("Publication Details: ");
                       
                 for(int i=0; i<n; i++)
                             b[i].display(); //Dynamic method dispatch ->display of Bookpublication or Paperpublication 
          
                   }
   }
         




      

