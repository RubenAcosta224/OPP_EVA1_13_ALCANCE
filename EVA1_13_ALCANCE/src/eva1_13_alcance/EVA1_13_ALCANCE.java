/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_alcance;

/**
 *
 * @author invitado
 */
public class EVA1_13_ALCANCE {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    int x=70;
    
    for (int i = 0; i < 10; i++) {
      System.out.println("i = "+i);
      
      System.out.println("j = "+j);//no visible no se ha declarado antes
      
      int j=100;//a partir de aqui es visible
      
      System.out.println("j = "+j);
      System.out.println("x = "+x);//visible
      
      {
        int z=43;
        System.out.println("z = "+z);
      }
    }
    
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    
    System.out.println("x = "+x);
    
    System.out.println("z = "+z);
  }
  
  
  public static void algo(){
    System.out.println("x = "+x);//error la variable x esta en otro bloque de codigo
  }
  
}
