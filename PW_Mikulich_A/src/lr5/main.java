package lr5;

import lr5.domain.*;
import lr5.repository.*;
import lr5.service.*;
import lr5.store.*;
import lr5.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class main implements CommandLineRunner{
   
    @Autowired
    ProfessorService roomService;

    @Autowired
    CourseService computerService;

    @Autowired
    Repository fileFepository;

    @Autowired
    Course computerRep;

    @Autowired
    Prof roomRep;

    public static void main(String[] args) throws UnknownProfessorException, UnknownCourseException, UnknownGruppe {
        SpringApplication.run(main.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
       CourseStore.allcomputers = (ArrayList<Name_course>) courseRep.findAll();

    }
}