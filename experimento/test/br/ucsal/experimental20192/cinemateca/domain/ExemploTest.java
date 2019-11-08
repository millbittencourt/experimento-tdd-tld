package br.ucsal.experimental20192.cinemateca.domain;

import br.ucsal.experimental20192.cinemateca.enums.GeneroAtorEnum;
import br.ucsal.experimental20192.cinemateca.enums.GeneroFilmeEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExemploTest {

	@Before
	public void setUp() {
		// TODO: Se necessario realizar setUp antes do teste

	}

	// M�todo que dever� ser testado
	@Test
	public void metodoTest() {
		// Dados de Entrada

		// Valor Esperado

		// Execu��o do metodo a ser testado

		// Compara��o do valor retornado com o esperado

	}

	/*
	incluirAtorElenco:
		Deve ter como parâmetro nome, ano de nascimento e gênero do ator.
		Este método deve incluir, para o filme, um ator com os parâmetros passados.
		A inclusão de um ator no elenco deve ser precedida de duas validações:
		Não deve existir outro ator no elenco com o mesmo nome;
		O ator não pode ter nascido em ano posterior ao lançamento do filme;
		O retorno deste método deve ser um booleano indicando se o ator foi incluído ou não.
		True para incluido e false para não incluído.
*/
	@Test //16h30 - 17h35 (5min)
	public void deveIncluirAtorElenco(){
		//parametros Ator
		Ator ator = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);
		//Filme para teste:
		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");
		//incluirNoElenco
		boolean esperado = filme.incluirAtorElenco(ator);
		//RetornaTrue
		Assert.assertTrue(esperado);
	}

	@Test //9h56 - 9h57 (1min)
	public void naoDeveIncluirAtorMaisNovoQueFilme(){
		//parametros Ator
		Ator ator = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);
		//Filme para teste:
		Filme filme = new Filme("Titulo", 1994, "Sinopse do filme de titulo titulo lançado em 2010");
		//incluirNoElenco
		boolean esperado = filme.incluirAtorElenco(ator);
		//RetornaTrue
		Assert.assertFalse(esperado);
	}

	@Test //9h59 - 10h05 (6min)
	public void naoDeveIncluirAtorComMesmoNomeNoElenco(){
		//parametros Ator
		Ator ator = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);
		Ator ator2 = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);
		//Filme para teste:
		Filme filme = new Filme("Titulo", 1999, "Sinopse do filme de titulo titulo lançado em 2010");
		filme.incluirAtorElenco(ator2);
		//incluirNoElenco
		boolean esperado = filme.incluirAtorElenco(ator);
		//RetornaTrue
		Assert.assertFalse(esperado);
	}
	/*
	removerAtorElenco:
	Deve ter como parâmetro o nome do ator;
	Este método deve remover um ator do elenco do filme.
	Para remover o ator deve colocar null na posição correspondente do vetor de elenco.
	O retorno deste método deve ser um booleano indicando se o ator foi removido ou não.
	True para removido e false para caso o ator não exista.
 */
	@Test //10h12 - 10h14 (2min)
	public void deveRemoverAtorElenco(){
		//parametros Ator
		Ator ator = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);

		//Filme para teste:
		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");
		filme.incluirAtorElenco(ator);

		//removerAtor
		boolean esperado = filme.removerAtorElenco(ator.getNome());

		//RetornaTrue
		Assert.assertTrue(esperado);
	}

	@Test //10h26 - 10h27 (1min)
	public void naoDeveRemoverPoisAtorNaoExiste(){
		//parametros Ator
		Ator ator = new Ator("Nome", 1995, GeneroAtorEnum.FEMININO);

		//Filme para teste:
		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");
		filme.incluirAtorElenco(ator);

		//removerAtor
		boolean esperado = filme.removerAtorElenco("Jurema");

		//RetornaTrue
		Assert.assertFalse(esperado);
	}

    /*
    consultarElencoPorGenero:
    Deve ter como parâmetro o gênero do ator;
    Este método deve retornar os atores do elenco que sejam do gênero passado como parâmetro;
    O vetor de retorno deve ter o tamanho máximo permitido para o vetor de elenco (20).
    As posições não ocupadas do vetor devem conter valor null;
     */
	//10h38 - 10h43 (5min)
	@Test
	public void deveConsultarElencoPorGeneroFeminino(){
		Ator ator1 = new Ator("Ator1", 1997, GeneroAtorEnum.FEMININO);
		Ator ator2 = new Ator("Ator2", 1997, GeneroAtorEnum.MASCULINO);
		Ator ator3 = new Ator("Ator3", 1997, GeneroAtorEnum.FEMININO);
		Ator ator4 = new Ator("Ator4", 1997, GeneroAtorEnum.MASCULINO);

		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");
		filme.incluirAtorElenco(ator1);
		filme.incluirAtorElenco(ator2);
		filme.incluirAtorElenco(ator3);
		filme.incluirAtorElenco(ator4);
		//
		Ator[] esperado = {ator1, ator3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		Ator[] retornado = filme.consultarElencoPorGenero(GeneroAtorEnum.FEMININO);
		//
		Assert.assertEquals(esperado, retornado);
	}
	//10H52-10H53 (1min)
	@Test
	public void deveConsultarElencoPorGeneroMasculino(){
		Ator ator1 = new Ator("Ator1", 1997, GeneroAtorEnum.FEMININO);
		Ator ator2 = new Ator("Ator2", 1997, GeneroAtorEnum.MASCULINO);
		Ator ator3 = new Ator("Ator3", 1997, GeneroAtorEnum.FEMININO);
		Ator ator4 = new Ator("Ator4", 1997, GeneroAtorEnum.MASCULINO);

		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");
		filme.incluirAtorElenco(ator1);
		filme.incluirAtorElenco(ator2);
		filme.incluirAtorElenco(ator3);
		filme.incluirAtorElenco(ator4);
		//
		Ator[] esperado = {ator2, ator4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		Ator[] retornado = filme.consultarElencoPorGenero(GeneroAtorEnum.MASCULINO);
		//
		Assert.assertEquals(esperado, retornado);
	}
	/*
	pesquisarAtor:
	Deve ter como parâmetro o nome do ator;
	Este método deve retornar o ator do elenco cujo nome corresponde ao passado como parâmetro.
	Caso nenhum ator do elenco tenha nome igual ao passado como parâmetro. este método deve retornar null.

*/
	//10h57 - 11h01 (4min)
	@Test
	public void devePesquisarAtor(){
		Ator atorEsperado = new Ator("Ator", 1997, GeneroAtorEnum.MASCULINO);
		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");

		filme.incluirAtorElenco(atorEsperado);

		//
		Ator atorRetornado = filme.pesquisarAtor(atorEsperado.getNome());
		//
		Assert.assertEquals(atorEsperado, atorRetornado);

	}

	@Test //(ops)
	public void naoDeveAcharAtorPesquisado(){
		Ator ator = new Ator("Ator", 1997, GeneroAtorEnum.MASCULINO);
		Filme filme = new Filme("Titulo", 2010, "Sinopse do filme de titulo titulo lançado em 2010");

		filme.incluirAtorElenco(ator);

		//
		Ator atorRetornado = filme.pesquisarAtor("Maria");
		//
		Assert.assertEquals(null, atorRetornado);

	}


}
