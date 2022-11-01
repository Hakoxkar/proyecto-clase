package tutorial.misionTIC.controladores;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tutorial.misionTIC.Repositorios.RepositorioUsuario;
import tutorial.misionTIC.modelos.Usuario;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class ControladorUsuario {
    @Autowired
    private RepositorioUsuario miRepositorioUsuario;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario infUsuario){
        System.out.println("Entre");
        log.info("Creando usuario...");

        String contrasenaCifrada = convertirSHA256(infUsuario.getContrasena());
        infUsuario.setContrasena(contrasenaCifrada);
        return miRepositorioUsuario.save(infUsuario);

    }
    public String convertirSHA256(String password) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        byte[] hash = md.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();
        for(byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
