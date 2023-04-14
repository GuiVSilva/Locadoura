/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Usuario
 */
public class Automovel {
    protected String modelo;
    protected String placa;
    protected String montadora;
    protected String cor;
    protected String cambio;
    protected String combustivel;
    
    //Construtor
    public Automovel(String modelo, String placa, String montadora, String cor, String cambio, String combustivel) {
      //Encapsulamento
       if(modelo == null || modelo.isEmpty()){
        throw new RuntimeException("O modelo nao pode ser vazio");
        }else{
            if(placa == null || placa.isEmpty()){
                throw new RuntimeException("A placa nao pode ser vazio");
            }else{
                if(montadora == null || montadora.isEmpty()){
                    throw new RuntimeException("A montadora nao pode ser vazio");
            }else{
                    if(cor == null || cor.isEmpty()){
                        throw new RuntimeException("A cor nao pode ser vazio");
                    }else{
                        if(cambio == null || cambio.isEmpty()){
                            throw new RuntimeException("O cambio nao pode ser vazio");
                    }else{
                        if(combustivel == null || combustivel.isEmpty()){
                            throw new RuntimeException("O combustivel nao pode ser vazio");
                        }
                       }
                    }
                }
            }
      } 
        this.modelo = modelo;
        this.placa = placa;
        this.montadora = montadora;
        this.cor = cor;
        this.cambio = cambio;
        this.combustivel = combustivel;
    }
    
    //Get e Set
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCambio(){
        return cambio;
    }
    
    public void setCambio(String cambio){
        this.cambio = cambio;
    }
    
    public String getCombustivel(){
        return combustivel;
    }
    
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }
    
    //metodo Insert()
    public void Insert(){
     System.out.println("insert into veiculos(modelo, placa, montadora, cor, cambio, combustivel) values (" + getModelo() + ", " + getPlaca()  + ", " + getMontadora() + ", " + getCor() + ", " + getCambio() + ", " + getCombustivel() + ")");
    }
    
    //O método validarPlaca recebe como entrada uma String placa.
    public boolean validarPlaca(String placa) {
    //Verifica se a placa é nula ou não tem 7 caracteres. Se sim, retorna false.
    if (placa == null || placa.length() != 7) {
        return false;
    }
    //Separa as três primeiras letras
    String letras = placa.substring(0, 3);
    
    //Separa os quatro números da placa
    String numeros = placa.substring(3);
    
    //Verifica se as três primeiras letras são todas maiúsculas. Se não, retorna false.
    for (int i = 0; i < 3; i++) {
        char letra = letras.charAt(i);
        if (!Character.isUpperCase(letra)) {
            return false;
        }
    }
    
    //Verifica se os quatro números são realmente números. Se não, retorna false.
    for (int i = 0; i < 4; i++) {
        char numero = numeros.charAt(i);
        if (!Character.isDigit(numero)) {
            return false;
        }
    }
    
    //Se chegou até aqui, a placa é válida e o método retorna true.
    return true;
}

    //metodo toString()
    @Override
    public String toString() {
        return "Modelo: " + this.modelo + " Placa: " + this.placa + " Montadora: " + this.montadora + " Cor: " + this.cor + " Cambio: " + this.cambio + " Combustivel: " + this.combustivel;
    }
    

}
