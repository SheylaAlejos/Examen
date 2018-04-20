package tecsup.sheyla.com.examen.repositories;


import com.orm.SugarRecord;

import java.util.List;

import tecsup.sheyla.com.examen.models.User;

public class UserRepository {
    public static List<User> list(){
        List<User> users = SugarRecord.listAll(User.class);
        return users;
    }
    public static void create(String usuario, String nombres, String email, String password){
        User user = new User(usuario, nombres, email, password);
        SugarRecord.save(user);
    }
}
