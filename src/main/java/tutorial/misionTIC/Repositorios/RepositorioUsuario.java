package tutorial.misionTIC.Repositorios;


import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {


}
