package lr5.service;
import lr5.domain.Name_course;
import lr5.exception.*;

public interface CourseService {
	    void WriteOffPC(int id) throws UnknownCourseException, UnknownProfessorException;
	    void ChangePCPlace(int id_pc, int pc_id_to) throws UnknownCourseException, NoGruppeException;
	    Name_course findPC(int id) throws UnknownCourseException;
	}