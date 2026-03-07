import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Shrek");
        meuFilme.setAnoDeLancamento (2001);
        meuFilme.setDuracaoEmMinutos(90);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);

    }
}