package aplicacao;


public class Motor {
    public EstadoAplicacao estadoDaLoja;

    UXHelper console;

    public Motor(UXHelper console, EstadoAplicacao estadoAplicacao){
        this.estadoDaLoja = estadoAplicacao;
        this.console = console;
    }

    public void proximoPasso() {

        while (estadoDaLoja != EstadoAplicacao.FINALIZADO) {
            switch (estadoDaLoja) {
                case VENDENDO:
                    console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Albuns de Musicas \n[5] - Brinquedos\n[0] - Ver todos");
                    Integer selecao = console.getInt();
                    while(selecao < 0 || selecao > 5) {
                        console.print("Opcão invalida. \n");
                        console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Albuns de Musicas \n[5] - Brinquedos\n[0] - Ver todos\n[9] - Voltar");
                        selecao = console.getInt();
                        if (selecao == 9) {
                            estadoDaLoja = EstadoAplicacao.ESPERANDO;
                            break;
                        }
                    }
                    break;
        
                case ESPERANDO:
                    printarMenu();
                    selecao = console.getInt();
                    while (selecao > 2 || selecao < 0) {
                        console.print("Selecione uma opção valida ou aperte [0] para sair \n\n");
                        printarMenu();
                        selecao = console.getInt();
                    }

                    if(selecao == 0) {
                        estadoDaLoja = EstadoAplicacao.FINALIZADO;
                        return;
                    }

                    estadoDaLoja = selecao == 1 ? EstadoAplicacao.VENDENDO : EstadoAplicacao.EDITANDO;
                    break;
                
                case EDITANDO:
                    
                    console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Álbuns de Músicas \n[5] - Brinquedos\n[0] - Ver todos");
                    selecao = console.getInt();
                    while(selecao < 0 || selecao > 5) {
                        console.print("Opcão inválida. \n");
                        console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Álbuns de Músicas \n[5] - Brinquedos\n[0] - Ver todos\n[9] - Voltar");
                        selecao = console.getInt();
                        if (selecao == 9) {
                            estadoDaLoja = EstadoAplicacao.ESPERANDO;
                            break;
                        }
                    }
                    break;
                
                default:
                    break;
            }
        }
    }
    


    private void printarMenu() {
        console.print("Selecione uma opção: \n[1] - Ver produtos \n[2] - Cadastrar novo Produto");
    }





}
