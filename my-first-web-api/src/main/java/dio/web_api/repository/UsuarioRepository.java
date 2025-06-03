package dio.web_api.repository;
import dio.web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null) {
            System.out.println("Salvando o usuário!");
        } else {
            System.out.println("Atualizando o usuário!");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.printf("Recebendo o id: %d para exclusão do usuário!/n", id);
        System.out.println(id);
    }

    public Usuario findById(Integer id){
        System.out.printf("Recebendo o id: %d para busca do usuário!/n", id);
        return new Usuario("Jean", "senha123");
    }

    public Usuario findByUsername(String username){
        System.out.printf("Recebendo o username: %s para busca do usuário!/n", username);
        return new Usuario(username, "senha123");
    }

    public List<Usuario> findAll(){
        System.out.println("Buscando todos os usuários!");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Isa", "123456"));
        usuarios.add(new Usuario("Bela", "10112001"));
        return usuarios;
    }
}
