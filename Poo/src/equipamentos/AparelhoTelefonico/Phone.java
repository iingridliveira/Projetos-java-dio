package equipamentos.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico{
    public String numero;

    @Override
    public void ligar(String novonumero) {
      numero= novonumero;
    System.out.println("ligando para "+ novonumero);

    }

    public void atender() {
        System.out.println("Atender com sucesso");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("correio de voz ativada");
    }
}

