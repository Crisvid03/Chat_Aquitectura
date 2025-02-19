package da.chat.tweet.servise;

import da.chat.tweet.model.Tweet;
import da.chat.tweet.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TweetServiceImple implements TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public List<Tweet> findByUsersId(Integer idUser) {
        return tweetRepository.findByUsersId(idUser);
    }

    @Override
    public Tweet guardarTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    @Override
    public void eliminarTweet(Tweet tweet) {
        tweetRepository.delete(tweet);
    }
}
