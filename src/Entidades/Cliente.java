package Entidades;


import jakarta.persistence.*;


import java.util.List;



@Entity
public class Cliente{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_Cliente")
	private Long id;
	
	private String nome , cpf , endereco , email;
	private float Saldo;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> PedidosCliente;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BIBLIO_ID")
	private Biblioteca biblioteca;
	
	public Cliente(String nome, String email, String cpf, String endereco ,Biblioteca biblioteca) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.biblioteca = biblioteca;
	}
	
	public Cliente() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setFone(String endereco) {
		this.endereco = endereco;
	}
	
	
}