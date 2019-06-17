
package Formulario;

// Herança
public class Pessoa extends Adotante{
  
    public String cpf;
    public String rg;
    public String genero;
    public String cnpj;
    private String uso;
    private String b;
    private String a;
    private String x;
    
    
    
    public Pessoa(){
        this.cpf = "11778589677";
        this.rg = "MG-18789";
        
    }
    
    //Polimorfismo SObre Posição
    public Pessoa(String x, String a, String b){
         this.x = rg;   
         this.a = cpf;    
         this.b = a+x;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = getRg()+", "+getCpf();
    }
        
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
