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


    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer>answers;


}
