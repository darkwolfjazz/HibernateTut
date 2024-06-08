package map;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Answer {

@Id
private int answer_id;
private String answer;

@ManyToOne(cascade = CascadeType.ALL)
private Question question;

}
