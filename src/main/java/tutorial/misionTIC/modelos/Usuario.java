package tutorial.misionTIC.modelos;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document()
public class Usuario {
    @Id
    private String _id;

    private String seudonimo;
    private String correo;
    private String contrasena;

    public Usuario(String seudonimo, String correo, String contrasena) {
        this.seudonimo = seudonimo;
        this.correo = correo;
        this.contrasena = contrasena;


    }
}
