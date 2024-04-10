/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camión;

/**
 *
 * @author prisc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        camion unCamion = new camion();
        
        unCamion.setMarca("Ford");
        unCamion.setModelo("Berford");
        unCamion.setAño(80);
        unCamion.setRevisionTecnica(true);
        
        
        System.out.println(unCamion.getMarca());
        
        System.out.println(unCamion);
    }
    
}
