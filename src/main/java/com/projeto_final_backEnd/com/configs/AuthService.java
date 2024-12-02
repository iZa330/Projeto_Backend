package com.projeto_final_backEnd.com.configs;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.Usuario;
import com.projeto_final_backEnd.com.exceptions.NotFoundException;
import com.projeto_final_backEnd.com.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthService implements UserDetailsService {
	
	@Autowired
	UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
		Usuario usuario = repository.findByLogin(username)
				.orElseThrow(() -> new NotFoundException("Não encontrado"));
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}

}
