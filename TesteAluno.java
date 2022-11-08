package uscs;


public class TesteAluno {


    public static void main(String[] args) 
    {
        Aluno a = new Aluno (12, "joao", "rua x", "123", "666", 6.0, 8.0, 12);
        a.imprimeAluno();
        a.imprimeFaltas();
        a.resultado();   
    }
    
}
