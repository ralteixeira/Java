package game;

public class Game {


    String nomeGame,tipoGame,plataforma;
    int anoLancamento,valorGame;

    public String getNomeGame() {
        return nomeGame;
    }

    public void setNomeGame(String nomeGame) {
        this.nomeGame = nomeGame;
    }

    public String getTipoGame() {
        return tipoGame;
    }

    public void setTipoGame(String tipoGame) {
        this.tipoGame = tipoGame;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getValorGame() {
        return valorGame;
    }

    public void setValorGame(int valorGame) {
        this.valorGame = valorGame;
    }

    public Game(String nomeGame, String tipoGame, String plataforma, int anoLancamento, int valorGame) {
        this.nomeGame = nomeGame;
        this.tipoGame = tipoGame;
        this.plataforma = plataforma;
        this.anoLancamento = anoLancamento;
        this.valorGame = valorGame;

    }

    public void visualiza(){

        System.out.println("**********ONEYE GAMES**********");
        System.out.println("                               ");
        System.out.println("Nome do Game - " + this.nomeGame);
        System.out.println("Tipo de Game - " + this.tipoGame);
        System.out.println("Plataforma - " + this.plataforma);
        System.out.println("Ano de Lancamento do Game - " + this.anoLancamento);
        System.out.println("Valor do Game - " + this.valorGame);
    }
}
