package equipamentos.ReprodutorMusical;

public class IPod implements  ReprodutorMusical {
    public String   musica;

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String novamusica) {
       musica= novamusica;
       System.out.println(musica);
    }
}
