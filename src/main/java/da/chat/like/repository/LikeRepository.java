package da.chat.like.repository;

import da.chat.like.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository <Likes , Integer> {
    List<Likes> findByTweetId (Integer idTweet);
    List<Likes> findByUsersId (Integer idUser);
}
