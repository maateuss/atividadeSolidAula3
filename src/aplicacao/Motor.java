package aplicacao;

import javax.management.monitor.Monitor;

public class Motor {
    static EstadoAplicacao estadoDaLoja;

    UXHelper console;

    public Motor(UXHelper console, EstadoAplicacao estadoAplicacao){
        this.estadoDaLoja = estadoAplicacao;
        this.console = console;
    }

    public EstadoAplicacao proximoPasso() {

        while (estadoDaLoja != EstadoAplicacao.FINALIZADO) {
            switch (estadoDaLoja) {
                case VENDENDO:
                    console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Álbuns de Músicas \n[5] - Brinquedos\n[0] - VER TODOS");
                    Integer selecao = console.getInt();
                    while(selecao < 0 || selecao > 5) {
                        console.print("Opcão inválida. \n");
                        console.print("Selecione uma categoria: \n[1] - Livros \n[2] - Jogos \n[3] - Filmes \n[4] - Álbuns de Músicas \n[5] - Brinquedos\n[0] - VER TODOS");
                        selecao = console.getInt();
                        if (selecao == 0) {
                            return EstadoAplicacao.ESPERANDO;
                        }
                    }
                    break;
        

                
                default:
                    return EstadoAplicacao.ESPERANDO;
            }
        }

        return EstadoAplicacao.ESPERANDO;
    }




}
