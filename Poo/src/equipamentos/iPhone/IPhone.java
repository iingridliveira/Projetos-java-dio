package equipamentos.iPhone;

import equipamentos.AparelhoTelefonico.AparelhoTelefonico;
import equipamentos.NavegadorInternet.NavegadorInternet;
import equipamentos.ReprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public String numero;
    public String musica;
    public String url;
    @Override
    public void ligar(String novonumero) {
        numero= novonumero;
        System.out.println("ligando para "+ novonumero);
    }

    @Override
    public void atender() {
        System.out.println("atender pelo IPHONE");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio voz");
    }

    @Override
    public void selecionarMusica(String novamusica) {
        musica = novamusica;
        System.out.println("selecionando musica " + novamusica);
    }

    @Override
    public void tocar() {
        System.out.println("tocar pelo IPHONE");

    }

    @Override
    public void pausar() {
       System.out.println("pausar pelo IPHONE");
    }

    @Override
    public void exibirPagina(String navaurl) {
        url= navaurl;
        System.out.println("exibindo pagina " + navaurl);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando aba ");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina ");
    }
}
