/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Usuario
 */
public class Carro extends Automovel {
    protected int qtd_portas;
    protected int potencia;
    
    //Construtor
    public Carro(String modelo, String placa, String montadora, String cor, String cambio, String combustivel, int qtd_portas, int potencia) {
        super(modelo, placa, montadora, cor, cambio, combustivel);
        //Encapsulamento
        if(potencia <=0 ){
            throw new RuntimeException ("Potencia invalida, nao pode ser menor ou igual a zero");
        }else{
            if(qtd_portas < 2){
                throw new RuntimeException ("Quantidade de portas invalidas, nao pode ser menor que dois");
            }
        }
        this.qtd_portas = qtd_portas;
        this.potencia = potencia;
    }

    //Get e Set
    public int getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    //metodo Insert()
    @Override
    public void Insert(){
     System.out.println("insert into carro (modelo, placa, montadora, cor, cambio, combustivel, quantidade de portas, potencia) values (" + getModelo() + ", " + getPlaca() + ", " + getMontadora() + ", " + getCor() + ", " + getCambio() + ", " + getCombustivel() + ", " + getQtd_portas() + ", " + getPotencia() + ")");
    }
    
    //metodo toString()
    @Override
    public String toString() {
        return "Modelo: " + this.modelo + " Placa: " + this.placa + " Montadora: " + this.montadora + " Cor: " + this.cor + " Cambio: " + this.cambio + " Combustivel: " + this.combustivel + " Quantidade de Portas: " + this.qtd_portas + " Potencia: " + this.potencia;
    }
}
