package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
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
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float c,s;
        c= ((f-32)*5.0f)/9.0f;
        s=(c*10);
        s=(int)s/10.0f;
        return s;
     }

}
