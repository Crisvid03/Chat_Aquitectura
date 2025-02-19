package da.chat.comment.repository;

import da.chat.comment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment , Integer> {
    List<Comment> commentsByTweet (Integer idTweet);
}
