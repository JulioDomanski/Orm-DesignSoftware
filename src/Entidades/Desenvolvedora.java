package Entidades;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Desenvolvedora {
	
	@Id
	@Column(name="DES_ID")
	private float id;
	
    private String nome , cnpj , endereco;
    
    @OneToMany(mappedBy="desenvolvedora")
    private List<Jogo> jogos;
	
	

}
