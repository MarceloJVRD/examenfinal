package examenfinal.examenfinal.repository;

import examenfinal.examenfinal.modelEntity.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Optional<Usuario> findByNickname(String nickname);

    Optional<Usuario> findByPassword(String password);

}
