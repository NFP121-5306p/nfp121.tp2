package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          int Fahrenheit = 0;
        float Celsius = 0;
       
       try{
        for (int i=0; i<args.length;i++){
            Fahrenheit =Integer.parseInt(args[i]);
            Celsius = fahrenheitEnCelsius(Fahrenheit);
        
            System.out.println(Fahrenheit + "\u00B0F -> " + Celsius + "\u00B0C"); 
        }    
      
       }catch(NumberFormatException e){
           System.out.println("Error : " + e.getMessage());  
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float c,s;
        c= ((f-32)*5.0f)/9.0f;
        s=(c*10);
        s=(int)s/10.0f;
        return s;
     }

}
