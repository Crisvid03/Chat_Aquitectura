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

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComment;

    @ManyToOne
    @JoinColumn(name = "idTweet" , nullable = false)
    private Tweet tweet;

    @ManyToOne
    @JoinColumn(name = "idUser" , nullable = false)
    private Users users;

    @Column(nullable = false , length = 280)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date publicationDate;

}

/*
3. *Comentario*
    - ComentarioID (PK)
    - TweetID (FK) (relación con Tweet)
    - UsuarioID (FK) (relación con Usuario)
    - Contenido
    - FechaComentario
*/
