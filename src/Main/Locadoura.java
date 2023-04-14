/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Class.Caminhao;
import Class.Carro;
import Class.Moto;

/**
 *
 * @author Usuario
 */
public class Locadoura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("Jetta", "ABC1234", "Volkswagen", "Prata", "Automatico", "Etanol", 4, 70);
        
        System.out.println("----------------CARRO-------------------");
        //metodo toString()
        System.out.println(carro);
        
        //teste com as placas 
        System.out.println(carro.validarPlaca("ABC1234"));
        System.out.println(carro.validarPlaca("aaa1234"));
 
        //metodo Insert()
        carro.Insert();
        
        
        Moto moto = new Moto("XJ6", "ABC1234", "Yamaha", "Preta", "Manual", "Gasolina", 600);
        
        System.out.println("----------------MOTO-------------------");
        //metodo toString()
        System.out.println(moto);
        
        //teste com as placas 
        System.out.println(moto.validarPlaca("ABC1234"));
        System.out.println(moto.validarPlaca("aaa1234"));
 
        //metodo Insert()
        moto.Insert();
        
        Caminhao caminhao = new Caminhao("Carreta", "ABC1234", "SCANIA", "Preta", "Manual", "Gasolina", 9, 41.9);
        
        System.out.println("----------------CAMINHAO------------------");
        //metodo toString()
        System.out.println(caminhao);
        
        //teste com as placas 
        System.out.println(caminhao.validarPlaca("ABC1234"));
        System.out.println(caminhao.validarPlaca("aaa1234"));
 
        //metodo Insert()
        caminhao.Insert();
    }
    
}
