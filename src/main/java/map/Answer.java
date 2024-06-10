package map;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Answer {

@Id
private int answer_id;
private String answer;

@ManyToOne(cascade = CascadeType.ALL)
private Question question;

}
