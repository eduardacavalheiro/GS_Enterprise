package entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_GS_CAD_ALIMENTO")
public class CadastroAlimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cad_alimento")
    private Long idCadAlimento;

    @Column(name = "nm_alimento", nullable = false)
    private String nomeAlimento;

    @Column(name = "dt_fabricacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataFabricacao;

    @Column(name = "dt_validade", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataValidade;

    @Column(name = "qtd_alimento", nullable = false)
    private Integer quantidadeAlimento;
    
    
    @Id
    @OneToMany
    private List<CadastroUsuario> idUsuario;
    
    
    @Id
    @ManyToOne
    private HistoricoSolicitacao idHistorico;
    
    
    
    //getters and setters
	public Long getIdCadAlimento() {
		return idCadAlimento;
	}

	public void setIdCadAlimento(Long idCadAlimento) {
		this.idCadAlimento = idCadAlimento;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Integer getQuantidadeAlimento() {
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(Integer quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
    
    
    
}
