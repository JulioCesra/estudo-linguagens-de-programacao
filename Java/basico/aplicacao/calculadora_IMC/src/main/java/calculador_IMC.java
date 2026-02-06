import java.util.ArrayList;

// Classe responsável por gerenciar os usuários
public class calculador_IMC {
    // ArrayList de usuários
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private double IMC_calculado;

    // Função responsável por adicionar novo usuário na ArrayList
    public void adicionar_novo_usuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    // Função que calcula o IMC e armazena o valor calculado na variável privada IMC_calculado
    public void calcular_IMC(Usuario usuario){this.IMC_calculado = usuario.getPeso() / Math.pow(usuario.getAltura(), 2);}

    // Função que mostrar no terminal o IMC calculado
    public void visualizar_IMC(){System.out.println("IMC calculado: " + Math.round(IMC_calculado));}

    static void main(String[] args){
        // Criação do objeto da classe calculadora de IMC
        calculador_IMC cal = new calculador_IMC();
        // Criação do objeto da classe Usuario
        Usuario user1 = new Usuario(
                "Julio",
                19,
                79,
                1.79
        );
        // Adição do usuário na ArrayList
        cal.adicionar_novo_usuario(user1);
        // Calculo do IMC com o peso e altura do usuário
        cal.calcular_IMC(user1);
        // Chamada da função de visualizar IMC
        cal.visualizar_IMC();
    }
}
