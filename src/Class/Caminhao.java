/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Usuario
 */
public class Caminhao extends Automovel {
    protected int qtd_eixos;
    protected double carga_maxima;
    
    //Contrutor
    public Caminhao(String modelo, String placa, String montadora, String cor, String cambio, String combustivel, int qtd_eixos, double carga_maxima) {
        super(modelo, placa, montadora, cor, cambio, combustivel);
        //Encapsulamento
        if(qtd_eixos <=0){
            throw new RuntimeException ("Quantidade de eixos invalida, nao pode ser igual ou menor que zero");
        }else{
            if(carga_maxima <=0){
               throw new RuntimeException ("Carga maxima invalida, nao pode ser igual ou menor que zero");
            }
       }
        this.qtd_eixos = qtd_eixos;
        this.carga_maxima = carga_maxima;
    }

    //Get e Set
    public int getQtd_eixos() {
        return qtd_eixos;
    }

    public void setQtd_eixos(int qtd_eixos) {
        this.qtd_eixos = qtd_eixos;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
    
    //metodo Insert()
    @Override
    public void Insert(){
     System.out.println("insert into caminhoes (modelo, placa, montadora, cor, cambio, combustivel, quantidade de eixos, carga maxima) values ( " + getPlaca() + "," + getModelo() +"," + getMontadora() + "," + getCor() + "," + getCambio() + "," + getCombustivel() + "," + getQtd_eixos() + "," + getCarga_maxima() + ")");
    } 
    
    //metodo toString()
    @Override
    public String toString() {
         return "Modelo: " + this.modelo + ", Placa: " + this.placa + ", Montadora: " + this.montadora + ", Cor: " + this.cor + ", Cambio: " + this.cambio + ", Combustivel: " + this.combustivel + ", Quantidade de Eixos: " + this.qtd_eixos + ", Carga Maxima: " + this.carga_maxima;
    }
}
