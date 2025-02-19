package da.chat.comment.servise;

import da.chat.comment.model.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> commentsByTweet(Integer idTweet);

    public  Comment guardarComentario (Comment comment);



    public  void eliminarComentario (Comment comment);
}
