import aplicacao.UXHelper;

public class App {
    public static void main(String[] args) throws Exception {
        
        UXHelper console = new UXHelper();
        console.print("Seja bem vindo a Livraria L");
        printarMenu(console);
        Integer option = console.getInt();

        while (option == null || option > 2 || option < 0) {
            console.print("Selecione uma opção valida ou aperte 0 para sair \n\n");
            printarMenu(console);
            option = console.getInt();
        }

        switch (option) {
            case 1:
                console.print("Ver Produtos");
                break;
            case 2:
                console.print("Cadastrar novo Produto");
                break;
        
            default:
                break;
        }

        
    }


    private static void printarMenu(UXHelper console) {
        console.print("Selecione uma opção: \n 1- Ver produtos \n 2- Cadastrar novo Produto");
    }
}
