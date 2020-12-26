package lr5.domain;

import lr5.exception.UnknownProfessorException;
import lr5.store.CourseStore;
import lr5.store.ProfessorStore;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;

@Component
@Entity
@Table(name = "PROFESSOR")
public class Professor {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Transient
    ArrayList<Name_course> computers_in_room = new ArrayList<Name_course>();

    @Transient
    ArrayList<Name_course> writeoffpc_in_room = new ArrayList<Name_course>();

    @Transient
    ArrayList<Gruppe> gruppes_in_room = new ArrayList<>();

    public Professor(int id) {
        this.id = id;
    }

    public Professor() {
    }

    public ArrayList<Name_course> getCourseInProf(){
        return course_in_prof;
    }
    public ArrayList<Name_course> getWriteOffPCInProf(){
        return writeoffpc_in_prof;
    }
    public ArrayList<Gruppe> getGruppe_in_course() {
        return gruppe_in_course;
    }


    public Professor getbyid(int id_professor){
        for (Professor rm: ProfessorStore.allprofessor){
            if (rm.getId()==id_professor) return rm;
        }
        return null;
    }

    public Gruppe getGruppe(int id_gruppe){
        for(Gruppe gruppe:gruppes_in_professor){
            if (gruppe.getId_gruppe()==id_gruppe)
                return gruppe;
        }
        return null;
    }

    public Name_course findPCbyPlace(int id_place){
        for (Name_course cour: CourseStore.allcomputers){
            if ((cour.getId_gruppe()==id_gruppe)&(cour.getProfessor()==this.id)) return cour;
        }
        return null;
    }

   
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
}