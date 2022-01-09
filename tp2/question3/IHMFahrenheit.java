package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
    
      int Fahrenheit = 0; // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      float Celsius = 0F; // à compléter, en appelant la méthode ad'hoc de la question2 
      // un test ici pour le zéro absolu (-273.1)

            Fahrenheit =Integer.parseInt(entree.getText());
            Celsius = fahrenheitEnCelsius(Fahrenheit);
             if(Celsius < -273.1f) {Celsius = -273.1f;};
            
           
      sortie.setText( Float.toString( Celsius));
    }catch(NumberFormatException e){
      sortie.setText("error ! " + e.getMessage());
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
    
      public static float fahrenheitEnCelsius( int f){
        float c,s;
        c= ((f-32)*5.0f)/9.0f;
        s=(c*10);
        s=(int)s/10.0f;
        return s;
     }

}
