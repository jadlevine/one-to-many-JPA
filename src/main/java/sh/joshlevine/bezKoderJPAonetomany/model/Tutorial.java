package sh.joshlevine.bezkoderjpaonetomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @SequenceGenerator(name = "tutorial_generator", sequenceName = "tutorial_generator", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
  private Long id;

  // @Column(name = "title")
  private String title;

  // @Column(name = "description")
  private String description;

  // @Column(name = "published")
  private boolean published;

  public Tutorial() {

  }

  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

  // getters, setters, overrides
  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
        + "]";
  }

}
