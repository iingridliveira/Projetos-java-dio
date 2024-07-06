package equipamentos.NavegadorInternet;

public class Internet implements NavegadorInternet{
    public String url;

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void exibirPagina(String novaurl) {
       url = novaurl;
        System.out.println(novaurl);

    }
}
