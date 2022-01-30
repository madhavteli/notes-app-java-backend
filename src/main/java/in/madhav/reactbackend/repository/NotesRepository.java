package in.madhav.reactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.madhav.reactbackend.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {

}
