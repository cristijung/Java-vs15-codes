//aqui vai a importação do package
import parteum.Dados;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando uma instância da classe Dados na Main
        //criar instância significa que a classe Dados está 'apta' a ser
        //utilizada na classe Main
        Dados dados = new Dados();

        //chamar o método
        dados.exibirDados();


        }
    }
