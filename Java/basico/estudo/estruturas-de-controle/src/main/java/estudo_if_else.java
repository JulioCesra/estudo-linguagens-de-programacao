
public class estudo_if_else {
    String nome_usuario = "Júlio";
    String usuario_digitado;

    public void set_nome_usuario_digitado(String usuarioDigitado){
        // Função responsável por receber o usuário digitado
        // Exemplo: o usuário digitou o nome (Carlos), esse nome vai ser armazenado na variável (usuario_digitado)
        usuario_digitado = usuarioDigitado;
    }

    public void verificar_usuario(){
        if (usuario_digitado.equals(nome_usuario)){
            System.out.println("Usuário validado com sucesso!");
        }else{
            System.out.println("Usuário incorreto!");
        }
    }
}
