package da.chat.like.model;

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

public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLike;

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
4. *Like*
    - LikeID (PK)
    - TweetID (FK) (relación con Tweet)
    - UsuarioID (FK) (relación con Usuario)
    - FechaLike
 */
