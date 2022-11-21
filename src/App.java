import javax.management.modelmbean.ModelMBeanAttributeInfo;

import aplicacao.EstadoAplicacao;
import aplicacao.Motor;
import aplicacao.UXHelper;

public class App {
    public static void main(String[] args) throws Exception {
        
        UXHelper console = new UXHelper();
        Motor motorAplicacao;

        console.print("Seja bem vindo a Livraria L");
        printarMenu(console);
        Integer option = console.getInt();

        while (option == null || option > 2 || option < 0) {
            console.print("Selecione uma opção valida ou aperte 0 para sair \n\n");
            printarMenu(console);
            option = console.getInt();
        }


        motorAplicacao = new Motor(console, option == 1 ? EstadoAplicacao.VENDENDO : EstadoAplicacao.EDITANDO);
        while(motorAplicacao.estadoDaLoja != EstadoAplicacao.FINALIZADO) {
            motorAplicacao.proximoPasso();
        }
        

        
    }


    private static void printarMenu(UXHelper console) {
        console.print("Selecione uma opção: \n[1] - Ver produtos \n[2] - Cadastrar novo Produto");
    }
}
