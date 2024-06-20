public class Aluno{
    private String nome;
    private String matricula;
    private double frequencia;
    private double p1;
    private double p2;
    private double p3;
    private double mediaExercicios;
    
    private double G1 = (p1 + p2 + p3 + mediaExercicios) / 4;
    private double G2;
    
    // construtor
    public Aluno(String nome, String matricula, double frequencia, double p1, double p2, double p3, double mediaExercicios, double G1, double G2){
        this.nome = nome;
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mediaExercicios = mediaExercicios;
        this.G1 = G1;
        this.G2 = G2;
    }
    
    // setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    // getters
    public String getNome(){
        return nome;
    }
    // metodos
    
    // toString
}