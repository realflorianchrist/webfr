package ch.fhnw.webfr.flashcard.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="questionnaires")
@Data
@NoArgsConstructor
public class Questionnaire {
	
	@Id
	private String id;
	private String title;
	private String description;
	
	public Questionnaire(String title, String description) {
		this.title = title;
		this.description = description;
	}
}
