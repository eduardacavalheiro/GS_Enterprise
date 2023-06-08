package testes;

import aplicacoes.dao.UsuarioDAO;
import entidades.CadastroUsuario;

public class ProgramaUsuario {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CadastroUsuario usuario = new CadastroUsuario();
		usuario.setIdUsuario(1L);
		usuario.setNomeCompleto("Maria dos Santos");
		usuario.setDataNascimento(null);
		usuario.setEmail("Maria@gmail.com");
		usuario.setSenha("1478");
		usuario.setNumeroTelefone("11 925987444");
		
		UsuarioDAO dao = new UsuarioDAO();
		usuario = dao.salvar(usuario);
		
		System.out.println("Usuario salvo: " + usuario.getIdUsuario() + ": " + usuario.getNomeCompleto());
	}

}
