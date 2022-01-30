package in.madhav.reactbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.madhav.reactbackend.entity.Note;
import in.madhav.reactbackend.repository.NotesRepository;

@CrossOrigin( origins = "*" )
@RestController
@RequestMapping("/api")
public class NotesController {

	@Autowired
	NotesRepository notesRepo;
	
	@GetMapping("/notes")
	public ResponseEntity<List<Note>> readNotes() {
		return new ResponseEntity<List<Note>>(notesRepo.findAll(), HttpStatus.OK);
	}
}
