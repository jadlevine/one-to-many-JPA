package sh.joshlevine.bezkoderjpaonetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sh.joshlevine.bezkoderjpaonetomany.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

  List<Tutorial> findByPublished(boolean published); // returns all Tutorials that have been published

  List<Tutorial> findByTitleContaining(String title); // returns all Tutorials which have a specific title

}
/*
 * Also have access to JpaRespository's methods: save(), findOne(), findById(),
 * findAll(), count(), delete(), deleteById() ... without explicitly
 * implementing them
 */