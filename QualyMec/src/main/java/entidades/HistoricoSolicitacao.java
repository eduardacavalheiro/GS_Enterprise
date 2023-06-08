package entidades;

import javax.persistence.*;

@Entity
@Table(name = "T_GS_HIST_SOLICITACAO")

public class HistoricoSolicitacao {

	@Id
    @Column(name = "id_historico")
    private Long idHistorico;

    @Column(name = "nm_organizacao", nullable = false)
    private String nomeOrganizacao;

    @Column(name = "sg_estado_orig", nullable = false, length = 2)
    private String siglaEstadoOrigem;

    @Column(name = "nm_cidade_orig", nullable = false)
    private String nomeCidadeOrigem;

    @Column(name = "ds_endereco_orig", nullable = false, length = 250)
    private String enderecoOrigem;

    @Column(name = "sg_estado_dest", nullable = false, length = 2)
    private String siglaEstadoDestino;

    @Column(name = "nm_cidade_dest", nullable = false)
    private String nomeCidadeDestino;

    @Column(name = "ds_endereco_dest", nullable = false, length = 100)
    private String enderecoDestino;

    @Column(name = "nm_alimento", nullable = false, columnDefinition = "TEXT")
    private String nomeAlimento;

    @Column(name = "qtd_alimento", nullable = false)
    private Integer quantidadeAlimento;

    @Column(name = "st_entrega", nullable = false, length = 20)
    private String statusEntrega;

   //chave estrangeira da tabela cadastroSolicitacao
   @OneToOne
   @Id
   private CadastroSolicitacao idSolicitacao;

    //getters and setters
	public Long getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Long idHistorico) {
		this.idHistorico = idHistorico;
	}

	public String getNomeOrganizacao() {
		return nomeOrganizacao;
	}

	public void setNomeOrganizacao(String nomeOrganizacao) {
		this.nomeOrganizacao = nomeOrganizacao;
	}

	public String getSiglaEstadoOrigem() {
		return siglaEstadoOrigem;
	}

	public void setSiglaEstadoOrigem(String siglaEstadoOrigem) {
		this.siglaEstadoOrigem = siglaEstadoOrigem;
	}

	public String getNomeCidadeOrigem() {
		return nomeCidadeOrigem;
	}

	public void setNomeCidadeOrigem(String nomeCidadeOrigem) {
		this.nomeCidadeOrigem = nomeCidadeOrigem;
	}

	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}

	public String getSiglaEstadoDestino() {
		return siglaEstadoDestino;
	}

	public void setSiglaEstadoDestino(String siglaEstadoDestino) {
		this.siglaEstadoDestino = siglaEstadoDestino;
	}

	public String getNomeCidadeDestino() {
		return nomeCidadeDestino;
	}

	public void setNomeCidadeDestino(String nomeCidadeDestino) {
		this.nomeCidadeDestino = nomeCidadeDestino;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public Integer getQuantidadeAlimento() {
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(Integer quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}

	public String getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}
    
    
    
}
