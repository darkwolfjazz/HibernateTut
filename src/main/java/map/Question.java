package map;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Question {

    @Id
    private int question_id;
    private String question;


    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Answer>answers;


}
