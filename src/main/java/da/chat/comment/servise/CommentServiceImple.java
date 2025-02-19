package da.chat.comment.servise;

import da.chat.comment.model.Comment;
import da.chat.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImple implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> commentsByTweet(Integer idTweet) {
        return commentRepository.commentsByTweet(idTweet);
    }

    @Override
    public Comment guardarComentario(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void eliminarComentario(Comment comment) {
        commentRepository.delete(comment);

    }
}
