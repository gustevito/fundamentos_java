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
    public Aluno(String nome, String matricula, double frequencia, double p1, double p2, double p3, double mediaExercicios){
        this.nome = nome;
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mediaExercicios = mediaExercicios;
    }
    
    // setters
    
    // getters
    
    // metodos
    
    // toString
}