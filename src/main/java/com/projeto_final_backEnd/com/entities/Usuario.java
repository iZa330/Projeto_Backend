package com.projeto_final_backEnd.com.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Usuario implements UserDetails {
	
	@Id
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String senha;
	
	@ManyToMany
	@JoinTable(name ="usuario_perfil",
			joinColumns = @JoinColumn(name ="usuario_id"),
			inverseJoinColumns = @JoinColumn(name ="perfil_id"))
	private List<Perfil> perfil =new ArrayList<>();
	
	public Usuario() {}
	
	
	public Usuario(Integer id, String login, String senha, List<Perfil> perfil) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return perfil.stream()
                .map(perfil -> new org.springframework.security.core.authority.SimpleGrantedAuthority(perfil.getNome()))
                .toList();
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.senha;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.login;
	}


	
}
