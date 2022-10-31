
public class Main 
{
    public static void main(String[]args)
    {
        Pessoa p1 = new Pessoa("italo", 123);
        Pessoa p2 = new Pessoa("italo", 123);
        /* atribuindo o equals para comparar as duas classes e onde estão armazenadas
        caso os dois objetos tenham o mesmo conteudo */
        System.out.println( p1.equals(p2)); 
        System.out.println( p1);
        System.out.println( p2);
    }
}

// equals tras o resultado de falso porque avalia o local na memoria onde foi armazenado.
class Pessoa
{
    private String nome;
    private int cpf;
    
    public Pessoa(String nome,int cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public int getCPF () {return this.cpf; }
    public String getNome (){return this.nome; }
    // função boleana usada para mudar o padrão do equals nesta operação.
    public boolean equals(Object o)
    {
      boolean result = false;
      if (this.getCPF() == ((Pessoa)o).getCPF()) {
          result = true;
        }
        return result;
    }
}   
