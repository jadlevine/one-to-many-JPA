package sh.joshlevine.bezkoderjpaonetomany.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
  private Long id;

  @Lob
  private String content;

  // @ManyToOne(fetch = FetchType.EAGER, optional = false) // eager loading is bad
  // for performance
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "tutorial_id", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonIgnore
  private Tutorial tutorial;

  // getters and setters
  public Long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Tutorial getTutorial() {
    return tutorial;
  }

  public void setTutorial(Tutorial tutorial) {
    this.tutorial = tutorial;
  }

}
