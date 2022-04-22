package examenfinal.examenfinal.modelEntity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nombres;
    @Column
    private boolean admin;
    @Column
    private String apellidos;
    @Column
    private String password;
    @Column
    private String nickname;
    @Column
    private Integer edad;
    @Column
    private boolean status;
}


