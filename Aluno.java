package uscs;


public class Aluno extends Pessoa
{
    private int codmat ;
    private double p1;
    private double p2;
    private int faltas;
    
  public Aluno(int codmat, String nome, String endereco, String cpf,
            String rg, double p1, double p2, int faltas) {
        super(nome, endereco, cpf, rg);
        this.codmat = codmat;  
        this.p1 = p1;
        this.p2 = p2;
        this.faltas = faltas;
    }
   
    public void imprimeAluno ()
    {
        super.imprimePessoa();
        System.out.println(p1+ " " + p2 + " " + faltas);
    }
   
    public void imprimeFaltas ()
    {
        System.out.println("Faltas: " + faltas);
    }
   
    public void resultado()
    {
        double media_final = (p1+p2)/2;
       
        if (faltas >=10)
        {
            System.out.println("Reprovado");
        }
        else
        {
            if (media_final < 3)
                System.out.println("Reprovado");
            else
                if (media_final >= 7)
                    System.out.println("Aprovado");
                else
                    System.out.println("Exame");
        }
                   
    }
}
    
    

    