package tecsup.sheyla.com.examen.models;

import com.orm.dsl.Table;

/**
 * Created by Alumno on 20/04/2018.
 */
@Table
public class User {
    private Long id;
    private String usuario;
    private String nombres;
    private String email;
    private String password;

    public User(){

    }
    public  User(String usuario, String nombres, String email, String password){
        this.usuario = usuario;
        this.nombres = nombres;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{"+
                "id="+ id +",usuario=" + usuario + '\'' +
                ",nombres=" + nombres + '\'' +
                ",email=" + email + '\'' +
                ",password=" + password + '\''+
                '}';
    }
}
