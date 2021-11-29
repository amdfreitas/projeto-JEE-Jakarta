package br.com.lojalines.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String usuario;
	private String nome;
	@JsonbDateFormat(value = "dd/MM/yyyy", locale =  JsonbDateFormat.DEFAULT_LOCALE)
	private LocalDate datacreate;
	
	public UserModel() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatacreate() {
		return datacreate;
	}
	public void setDatacreate(LocalDate datacreate) {
		this.datacreate = datacreate;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", usuario=" + usuario + ", nome=" + nome + ", datacreate=" + datacreate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(usuario, other.usuario);
	}	

}
