public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    
    private String numero;
    private String musica;
    private String url;

    public void ligar(String numero)
    {
        System.out.println("Ligando para " + this.numero);
    };
    public void atender(){
        System.out.println("Atendendo a chamada.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz.");
    }

    public void tocar(){
        System.out.println("Tocando musica...");
    }
    public void pausar(){
        System.out.println("Pausando musica...");
    }
    public void selecionarMusica(String musica){        
        System.out.println("Selecionando " + this.musica);
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina: " + this.url);
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina.");
    }
}
