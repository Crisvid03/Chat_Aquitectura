package da.chat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTweet;

    @ManyToOne
    @JoinColumn(name = "idUser" , nullable = false)
    private Users users;

    @Column(nullable = false , length = 280)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date publicationDate;

    @Column(nullable = false)
    private Integer numLikes = 0;

    @Column(nullable = false)
    private Integer numRetweets = 0;

    @Column(nullable = false)
    private Integer numComments = 0;
}

/*2. *Tweet*
   - TweetID (PK)
   - UsuarioID (FK) (relación con Usuario)
   - Contenido
   - FechaPublicación
   - NumLikes
   - NumRetweets
   - NumComentarios*/

