public  class Prents{
  
  void m1(){
    System.err.println("This is the Prents of the class");
  }

  
}
class  Child extends  Prents{
  // Overring 
  void m1(){
    System.err.println("Overring the method of prents");
  }

}