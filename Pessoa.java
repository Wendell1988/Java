package uscs;


public class Pessoa 
{
    private String nome;
    private String endereco;
    private String cpf;
    private String rg; 
    
    public Pessoa()
    {
    }

    public Pessoa(String nome, String endereço, String cpf, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }

   public void imprimePessoa ()
    {
        System.out.println(nome + " " + endereco + " " +
                cpf + " " + rg);
    }  
}