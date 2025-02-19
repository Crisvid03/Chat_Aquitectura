package da.chat.retweet.repository;

import da.chat.retweet.model.Retweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetweetRepository extends JpaRepository <Retweet , Integer> {
}
