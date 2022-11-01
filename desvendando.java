
public class Main 
{
  private String nome; // sem uso de atributo de visibilidade static
  private int idade; //uso do atributo de visibilidade static
  public static void main(String[] args)

  { main m = new main() // instancia da classe main
    m.nome = "paulo"; // acesso via instancia de classe
    Main.idade = 12; // acesso direto ao atributo
  System.out.println(Main.idade); //acessando via visibilidade static
  System.out.println(m.nome);  // acessando sem visibilidade static
  }

}
