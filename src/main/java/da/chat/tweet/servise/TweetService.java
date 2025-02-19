package da.chat.tweet.servise;

import da.chat.tweet.model.Tweet;
import java.util.List;

public interface TweetService {

    public List<Tweet> findByUsersId(Integer idUser);

    public Tweet guardarTweet(Tweet tweet);

    public void eliminarTweet(Tweet tweet);

}
