package lr5.domain;

import lr5.store.CourseStore;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name= "NAME_COURSE")
public class Name_course {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name="id_professor", nullable = false)
    private int id_professor;

    @Column(name= "id_gruppe", nullable = true)
    @GeneratedValue
    private int id_gruppe;

    @Column(name= "status", nullable = false)
    private String status;

    @Column(name = "writeoff_date", nullable = true)
    private String writeoff_date;

    public Name_course() {
    }

    public Name_course(int id, int id_professor, int id_gruppe, String status) {
        this.id = id;
        this.id_professor = id_professor;
        this.id_gruppe = id_gruppe;
        this.status = status;
        this.writeoff_date = null;
    }

    public Name_course getbyid(int id_pc){
        for (Name_course computer: CourseStore.allcomputers){
            if (computer.getId()==id_pc) return computer;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", id_room=" + id_professor +
                ", id_place=" + id_gruppe +
                ", status='" + status + '\'' +
                ", writeoff_date='" + writeoff_date + '\'' +
                '}';
    }

    public int getId_gruppe() {
        return id_gruppe;
    }

    public void setId_gruppe(int id_gruppe) {
        this.id_gruppe = id_gruppe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfessor(int id_room) {
        this.id_professor = id_professor;
    }


    public void setWriteoff_date(String writeoff_date) {
        this.writeoff_date = writeoff_date;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getProfessor() {
        return id_professor;
    }


    public String getWriteoff_date() {
        return writeoff_date;
    }


    public String getStatus() {
        return status;
    }
}