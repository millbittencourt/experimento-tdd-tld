package br.ucsal.experimental20192.cinemateca.domain;

import br.ucsal.experimental20192.cinemateca.enums.GeneroAtorEnum;
import br.ucsal.experimental20192.cinemateca.enums.GeneroFilmeEnum;

public class Filme {

    private static String titulo;
    private static int codigo;
    private static int anoLancamento;
    private static String sinopse;
    private static int qtdAtores = 20;
   // private static List<Ator> elenco = new ArrayList<>();
    private static Ator[] elenco = new Ator[qtdAtores];
  //  private static GeneroFilmeEnum generoFilme;

    //18h12 - 18h23 (11min+6min+5min+1min = 22min)
    public static boolean incluirAtorElenco(Ator ator){
            for(Ator a: elenco)
                if(a != null && ator.getNome().equals(a.getNome())) return false;

        if(ator.getAnoNascimento() > anoLancamento) return false;

        for(int i = 0; i < qtdAtores; i++){
            if(elenco[i] == null){
                elenco[i] = ator;
                return true;
            }
        }
            return false;
    }

    //10h15 - 10h29 (14min+2min+1min = 17min)
    public static boolean removerAtorElenco(String nome){
        for(int i = 0; i < qtdAtores; i++){
            if(elenco[i] != null && elenco[i].getNome().equals(nome)){
                elenco[i] = null;
                return true;
            }
        }
        return false;
    }

    /*
    consultarElencoPorGenero:
    Deve ter como parâmetro o gênero do ator;
    Este método deve retornar os atores do elenco que sejam do gênero passado como parâmetro;
    O vetor de retorno deve ter o tamanho máximo permitido para o vetor de elenco (20).
    As posições não ocupadas do vetor devem conter valor null;
     */
    //10h43 - 10h54 (11min+5min+1min = 17min)
    public static Ator[] consultarElencoPorGenero(GeneroAtorEnum genero){
        Ator[] retorno = new Ator[20];
        int j = 0;
            for (int i  = 0; i < qtdAtores; i++){
                if(elenco[i] != null && elenco[i].getGenero().equals(genero)){
                    retorno[j] = elenco[i];
                    j++;
                }
            }
            return retorno;
    }

    /*
	pesquisarAtor:
	Deve ter como parâmetro o nome do ator;
	Este método deve retornar o ator do elenco cujo nome corresponde ao passado como parâmetro.
	Caso nenhum ator do elenco tenha nome igual ao passado como parâmetro. este método deve retornar null.

*/
    //10h59 - 11h02 (3min+4min+1min = 8min)
    public static Ator pesquisarAtor(String nome){
        for(Ator a: elenco)
            if(a != null && a.getNome().equals(nome))
                return a;
        return null;
    }


    public Filme(String titulo, int anoLancamento, String sinopse) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Ator[] getElenco() {
        return elenco;
    }

  /*  public static GeneroFilmeEnum getGeneroFilme() {
        return generoFilme;
    }

    public static void setGeneroFilme(GeneroFilmeEnum generoFilme) {
        Filme.generoFilme = generoFilme;
    }*/
}
