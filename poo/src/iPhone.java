import repositories.AparelhoTelefonico;
import repositories.ReprodutorMusical;
import repositories.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação de ReprodutorMusical
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Chamada encerrada.");
    }

    // Implementação de NavegadorInternet
    @Override
    public void acessarSite(String url) {
        System.out.println("Acessando o site: " + url);
    }

    @Override
    public void realizarBusca(String busca) {
        System.out.println("Realizando busca por: " + busca);
    }
}
