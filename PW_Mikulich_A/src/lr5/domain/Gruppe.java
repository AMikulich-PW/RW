package lr5.domain;

import lr5.store.CourseStore;
import lr5.store.ProfessorStore;
import org.springframework.stereotype.Component;


public class Gruppe {

    private int id_gruppe;
    private int id_professor;
    private int id_pc;
    private String status;

    @Override
    public String toString() {
        return "Gruppe{" +
                "id_gruppe=" + id_gruppe +
                ", id_professor=" + id_professor +
                ", id_pc=" + id_pc +
                ", status='" + status + '\'' +
                '}';
    }

    public Gruppe(int id_gruppe, int id_professor, int id_pc, String status) {
        this.id_gruppe = id_gruppe;
        this.id_professor = id_professor;
        this.id_pc = id_pc;
        this.status = status;
    }


    public Gruppe(){
    }

    public int getId_pc() {
        return id_pc;
    }

    public void setId_pc(int id_pc) {
        this.id_pc = id_pc;
    }

    public Gruppe(int id_gruppe){
        this.id_gruppe=id_gruppe;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public int getId_gruppe() {
        return id_gruppe;
    }

    public void setId_gruppe(int id_gruppe) {
        this.id_gruppe = id_gruppe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
