public class Usuario {
    public static void main(String[] args){
        IPhone meuIPhone = new IPhone();

        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.ligar("meu contato");
        meuIPhone.exibirPagina("site");
        meuIPhone.atualizarPagina();
    }
}