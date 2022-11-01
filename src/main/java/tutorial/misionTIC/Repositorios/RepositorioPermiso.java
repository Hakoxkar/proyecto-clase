package tutorial.misionTIC.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import tutorial.misionTIC.modelos.Permiso;


public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
