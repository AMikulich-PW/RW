package lr5.service;


	import lr5.domain.Name_course;
	import lr5.exception.*;

	import java.util.ArrayList;
	
	public interface ProfessorService {
	    ArrayList<Name_course> findAllPC(int id_room) throws UnknownProfessorException;
	    ArrayList<Name_course> findWriteOffPC(int id_room)throws UnknownProfessorException;
	    }
