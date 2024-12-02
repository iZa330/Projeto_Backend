package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.Usuario;
import com.projeto_final_backEnd.com.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Integer id) {
        return repository.findById(id);
    }

    public String save(Usuario usuario) {
    	usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
    	repository.save(usuario);
        return "Login e senha salvas com sucesso!";
    }

    public Usuario update(Integer id, Usuario usuario) {
        Optional<Usuario> existingUsuario = repository.findById(id);
        if (existingUsuario.isPresent()) {
            Usuario updatedUsuario = existingUsuario.get();
            updatedUsuario.setLogin(usuario.getLogin());
            updatedUsuario.setSenha(usuario.getSenha());
            updatedUsuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
            return repository.save(updatedUsuario);
        }
        throw new RuntimeException("Usuário não encontrado com o ID: " + id);
    }

    public void delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
    }
}

