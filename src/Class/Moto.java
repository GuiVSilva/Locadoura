/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Usuario
 */
public class Moto extends Automovel {
   protected int cilindradas;
   
   //Contrutor
    public Moto(String modelo, String placa, String montadora, String cor, String cambio, String combustivel , int cilindradas) {
        super(modelo, placa, montadora, cor, cambio, combustivel);
        //Encapsulamento
        if(cilindradas <=0 ){
            throw new RuntimeException ("Cilindradas invalida, nao pode ser igual ou menor que zero");
        }
        this.cilindradas = cilindradas;
    }

    //Get e Set
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
   
    //metodo Insert()
    @Override
    public void Insert(){
     System.out.println("insert into moto (modelo, placa, montadora, cor, cambio, combustivel, cilindradas) values ( " + getModelo() + "," + getPlaca() + "," + getMontadora() + "," + getCor() + "," + getCambio() + "," + getCombustivel() + "," + getCilindradas() + ")");
    }
    
    //metodo toString()
    @Override
    public String toString() {
        return "Modelo: " + this.modelo + ", Placa: " + this.placa + ", Montadora: " + this.montadora + ", Cor: " + this.cor + ", Cambio: " + this.cambio + ", Combustivel: " + this.combustivel + ", Cilindradas: " + this.cilindradas;
    }
   
}
