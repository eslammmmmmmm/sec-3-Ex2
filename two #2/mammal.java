   
package pkginterface.pkg2;

 
public class mammal implements annimail{
    int NL;
    String Favfood;
    
//    public mammal()
//    {
//        
//    }
//    public mammal(int nl,String ffood)
//    {
//        this.NL=nl;
//        this.Favfood=ffood;
//    }

    public void setNL(int NL) {
        this.NL = NL;
    }

    public void setFavfood(String Favfood) {
        this.Favfood = Favfood;
    }
    
    int NoOfLegs()
    {
        return this.NL;
    }

    String FavFood ()
    {
      return Favfood;
    }
     @Override
     public void travel()
    {
        System.out.println("The Mammal have"+NoOfLegs()+" legs");
    }
    @Override
    public void eat() 
    {
       System.out.println("The Favorite Food is "+FavFood());
    }
   
   
    
    
}
