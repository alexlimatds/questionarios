package ifrn.etep.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="RESPOSTAUSUARIODATURMA")
public class RespostaUsuarioDaTurma implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private Integer frequenca;
	
	@ManyToOne(optional=false)
	private ItemAvaliacaoDaTurma itemAvaliacao; //unidirecional
	
	@ManyToOne(optional=false)
	private Usuario interrogado; //unidirecional
	
	@ManyToOne(optional=false)
	private TurmaSeriada turmaAvalida; //unidirecional

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ItemAvaliacaoDaTurma getItemAvaliacao() {
		return itemAvaliacao;
	}

	public void setItemAvaliacao(ItemAvaliacaoDaTurma itemAvaliacao) {
		this.itemAvaliacao = itemAvaliacao;
	}

	public Usuario getInterrogado() {
		return interrogado;
	}

	public void setInterrogado(Usuario interrogado) {
		this.interrogado = interrogado;
	}

	public TurmaSeriada getTurmaAvalida() {
		return turmaAvalida;
	}

	public void setTurmaAvalida(TurmaSeriada turmaAvalida) {
		this.turmaAvalida = turmaAvalida;
	}

	public Integer getFrequenca() {
		return frequenca;
	}

	public void setFrequenca(Integer frequenca) {
		this.frequenca = frequenca;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RespostaUsuarioDaTurma other = (RespostaUsuarioDaTurma) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
