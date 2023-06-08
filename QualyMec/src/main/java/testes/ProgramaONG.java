package testes;

import aplicacoes.dao.OngDAO;
import entidades.CadastroOng;

public class ProgramaONG {

    public static void main(String[] args) throws Exception {

        CadastroOng ong = new CadastroOng();
        ong.setNomeOrganizacao("Helping Hands");
        ong.setEmailResponsavel("helpinghands@email.com");
        ong.setSenha("password123");
        ong.setTelefoneResponsavel("123-456-7890");
        ong.setSiglaEstado("SP");
        ong.setNomeCidade("São Paulo");
        ong.setEndereco("Rua das Flores, 123");
        ong.setTipoDocumento("CNPJ");
        ong.setNumeroDocumento(12345678901234L);

        OngDAO dao = new OngDAO();
        ong = dao.salvar(ong);

        System.out.println("ONG salva: " + ong.getNomeOrganizacao());
    }

}
