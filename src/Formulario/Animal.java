
package Formulario;

public class Animal {
    
    public Raça r;
    private String nome;
    private String tipo;
    private String rga;
    private String datanasc;    
    private String genero;
    private String Deficiencia;
    private String Vacinado;
    private String Cadastro;
    private String DataResgate;
    private String Observação;
    private String Peso;
    private String Castrado;
    
    public Animal(){
        //Composição
        r = new Raça();
    }

    public String getCastrado() {
        return Castrado;
    }

    public void setCastrado(String Castrado) {
        this.Castrado = Castrado;
    }

    public String getCadastro() {
        return Cadastro;
    }

    public void setCadastro(String Cadastro) {
        this.Cadastro = Cadastro;
    }

    public String getDataResgate() {
        return DataResgate;
    }

    public void setDataResgate(String DataResgate) {
        this.DataResgate = DataResgate;
    }

    public String getObservação() {
        return Observação;
    }

    public void setObservação(String Observação) {
        this.Observação = Observação;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }
    
    
    
    public String getVacinado() {
        return Vacinado;
    }

    public void setVacinado(String Vacinado) {
        this.Vacinado = Vacinado;
    }

    public String getDeficiencia() {
        return Deficiencia;
    }

    public void setDeficiencia(String Deficiencia) {
        this.Deficiencia = Deficiencia;
    }
////alt + insert gerar get e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", tipo=" + tipo + ", rga=" + rga + ", datanasc=" + datanasc + ", genero=" + genero + ", Deficiencia=" + Deficiencia + '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    
    
}
