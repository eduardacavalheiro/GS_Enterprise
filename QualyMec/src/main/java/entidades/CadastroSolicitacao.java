package entidades;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "T_GS_CAD_SOLICITACAO")
public class CadastroSolicitacao {

	@Id
    @Column(name = "id_solicitacao")
    private Long idSolicitacao;

    @Column(name = "nm_organizacao", nullable = false)
    private String nomeOrganizacao;

    @Column(name = "ds_necessidade", nullable = false, columnDefinition = "TEXT")
    private String descricaoNecessidade;

    @Column(name = "qtd_necessidade", nullable = false, columnDefinition = "TEXT")
    private String quantidadeNecessidade;

    @OneToOne
    private HistoricoSolicitacao id_historico;
   
    @Id
    @ManyToOne
    private CadastroOng idOng;

    //getters and setters
    
	public Long getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(Long idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public String getNomeOrganizacao() {
		return nomeOrganizacao;
	}

	public void setNomeOrganizacao(String nomeOrganizacao) {
		this.nomeOrganizacao = nomeOrganizacao;
	}

	public String getDescricaoNecessidade() {
		return descricaoNecessidade;
	}

	public void setDescricaoNecessidade(String descricaoNecessidade) {
		this.descricaoNecessidade = descricaoNecessidade;
	}

	public String getQuantidadeNecessidade() {
		return quantidadeNecessidade;
	}

	public void setQuantidadeNecessidade(String quantidadeNecessidade) {
		this.quantidadeNecessidade = quantidadeNecessidade;
	}

    
    
    
}
