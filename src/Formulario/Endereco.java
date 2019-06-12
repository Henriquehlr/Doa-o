
package Formulario;


//Herança
public class Endereco extends Adotante{
                
        public String rua;
        public String número;
        public String cep;
        public String bairro;
        public String cidade;
        public String estado;
        
        //Polimorfismo Sobre Carga
        public String confere;
        public String a;
    
    public String Confere(String cidade){
       return  cidade;
       }

    public String getConfere() {
        return confere;
    }

    public void setConfere(String confere){
        this.confere = getCidade()+", "+getEstado();
    }
       
     
    
    public String Confere(String cidade, String estado){
       return  cidade+estado;
       
       
     }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


