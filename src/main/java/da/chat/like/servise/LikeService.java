package da.chat.like.servise;



import da.chat.like.model.Likes;

import java.util.List;

public interface LikeService {

    List<Likes> mostrarLikesPorTweet(Integer idTweet);

    List<Likes> mostrarLikesPorUsuario(Integer idUser);

    Likes darLikeATweet(Integer idTweet, Integer idUser);

    Likes darLikeAUsuario(Integer idUsuarioLikeado, Integer idUsuarioQueDaLike);

    void quitarLikeATweet(Integer idTweet, Integer idUser);

    void quitarLikeAUsuario(Integer idUsuarioLikeado, Integer idUsuarioQueQuitaLike);

}
