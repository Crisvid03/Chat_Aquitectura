package da.chat.user.servise;

import  da.chat.user.model.Users;
import java.util.List;

public interface UserService  {

    public List<Users> mostrarUsuarios();

    public  Users flitrarUsuarioPorId(Integer idUser);

    public Users guardarUsuario(Users users);

    public void eliminarUsuario(Users users);
}
