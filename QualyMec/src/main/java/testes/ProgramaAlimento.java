package testes;

import aplicacoes.dao.AlimentoDAO;
import entidades.CadastroAlimento;

import java.util.Date;

public class ProgramaAlimento {

	public static void main(String[] args) throws Exception {

		CadastroAlimento alimento = new CadastroAlimento();
		alimento.setIdCadAlimento(1L);
		alimento.setNomeAlimento("Arroz Integral");
		alimento.setDataFabricacao(new Date(2023, 4, 20)); // você pode ajustar a data como desejar
		alimento.setDataValidade(new Date(2023, 4, 20)); // você pode ajustar a data como desejar
		alimento.setQuantidadeAlimento(100); // exemplo de quantidade

		// Você pode também ajustar o idUsuario e idHistorico, como são relacionamentos você deve criar instâncias de suas classes e atribuir.

		AlimentoDAO dao = new AlimentoDAO();
		alimento = dao.salvar(alimento);

		System.out.println("Alimento salvo: " + alimento.getIdCadAlimento() + ": " + alimento.getNomeAlimento());
	}

}
