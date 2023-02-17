package sh.joshlevine.bezkoderjpaonetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;
import sh.joshlevine.bezkoderjpaonetomany.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByTutorialId(Long tutorialId); // returns all Comments of tutorialId

  @Transactional
  void deleteByTutorialId(long tutorialId); // deletes all Comments of tutorialId
}

/*
 * Also have access to JpaRespository's methods: save(), findOne(), findById(),
 * findAll(), count(), delete(), deleteById() ... without explicitly
 * implementing them
 */
