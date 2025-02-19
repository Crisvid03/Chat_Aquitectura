package da.chat.user.servise;

import da.chat.user.model.Users;
import da.chat.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> mostrarUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public Users flitrarUsuarioPorId(Integer idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    @Override
    public Users guardarUsuario(Users users) {
        return  userRepository.save(users);
    }

    @Override
    public void eliminarUsuario(Users users) {
        userRepository.delete(users);
    }


}
