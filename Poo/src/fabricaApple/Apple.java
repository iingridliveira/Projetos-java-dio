package fabricaApple;

import equipamentos.AparelhoTelefonico.AparelhoTelefonico;
import equipamentos.AparelhoTelefonico.Phone;
import equipamentos.NavegadorInternet.Internet;
import equipamentos.NavegadorInternet.NavegadorInternet;
import equipamentos.ReprodutorMusical.ReprodutorMusical;
import equipamentos.iPhone.IPhone;

public class Apple {
    public static void main(String[] args) {
        IPhone IP = new IPhone();
        Phone PH = new Phone();
        Internet internet = new Internet();
        AparelhoTelefonico Telefone = IP;
        NavegadorInternet Navegador = IP;
        ReprodutorMusical Reprodutor = IP;
        Telefone.atender();

    }
}
