package da.chat.retweet.model;

import da.chat.tweet.model.Tweet;
import da.chat.user.model.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Retweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRetweet;

    @ManyToOne
    @JoinColumn(name = "idTweet" , nullable = false)
    private Tweet tweet;

    @ManyToOne
    @JoinColumn(name = "idUser" , nullable = false)
    private Users users;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date publicationDate;

}
/*
5. *Retweet*
    - RetweetID (PK)
    - TweetID (FK) (relación con Tweet)
    - UsuarioID (FK) (relación con Usuario)
    - FechaRetwee
*/
