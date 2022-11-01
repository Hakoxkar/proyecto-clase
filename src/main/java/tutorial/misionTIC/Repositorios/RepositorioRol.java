package tutorial.misionTIC.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
