package entidades;

import javax.persistence.*;


@Entity
@Table(name = "T_GS_CADASTRO_ONG")
public class CadastroOng {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ong")
    private Long idOng;

    @Column(name = "nm_organizacao", nullable = false)
    private String nomeOrganizacao;

    @Column(name = "ds_email_respon", nullable = false)
    private String emailResponsavel;

    @Column(name = "ds_senha", nullable = false)
    private String senha;

    @Column(name = "nr_tel_respon", nullable = false)
    private String telefoneResponsavel;

    @Column(name = "sg_estado", nullable = false)
    private String siglaEstado;

    @Column(name = "nm_cidade", nullable = false)
    private String nomeCidade;

    @Column(name = "ds_endereco", nullable = false)
    private String endereco;

    @Column(name = "tp_doc", nullable = false)
    private String tipoDocumento;

    @Column(name = "nr_doc", nullable = false)
    private Long numeroDocumento;

    @ManyToOne
    private CadastroSolicitacao idSolicitacao;
  //getters and setters

	public Long getIdOng() {
		return idOng;
	}

	public void setIdOng(Long idOng) {
		this.idOng = idOng;
	}

	public String getNomeOrganizacao() {
		return nomeOrganizacao;
	}

	public void setNomeOrganizacao(String nomeOrganizacao) {
		this.nomeOrganizacao = nomeOrganizacao;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefoneResponsavel() {
		return telefoneResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel) {
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public CadastroSolicitacao getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(CadastroSolicitacao idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}
	
    
    
    
    
}
