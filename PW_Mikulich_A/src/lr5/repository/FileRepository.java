package lr5.repository;

import lr5.domain.*;
import lr5.store.*;
import java.io.*;

public class FileRepository implements Repository{
    public String line;
    public String[] data;
    private static String directory = "C:/Users/HP/lr5/";

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }


    @Override
    public void write(Course allcourse) {
        try (FileWriter fw = new FileWriter(directory +"comp/comp" + allcourses.getId() + ".txt")){
            fw.write(allcourses.getId()+" " + allcourses.getRoom() + " "+ allcourses.getId_place()+ " "
                    +allcourses.getStatus()+" "+allcourses.getWriteoff_date());
            fw.flush();
        }
        catch (IOException ex){
            System.out.println("Не удалось сохранить файл" + ex.getMessage());
        }
    }

    @Override
    public void write(Professor allprofessors) {
        try (FileWriter fw = new FileWriter(directory +"room/room" + allrooms.getId() + ".txt")){
            fw.write(allprofessors.getId());
            fw.flush();
        }
        catch (IOException ex){
            System.out.println("Не удалось сохранить файл" + ex.getMessage());
        }

    }

    @Override
    public void read() {
        try {
            File file = new File(directory+"cour/");
            File[] listofFiles = file.listFiles();
            for (int i = 0; i < listofFiles.length; i++) {
                File infile = new File(directory + "cour/"+ listofFiles[i].getName());
                FileReader fileReader = new FileReader(infile);
                BufferedReader reader = new BufferedReader(fileReader);
                line = reader.readLine();
                data = line.split(" ");
                Name_course name_course = new Name_course(Integer.parseInt(data[0]),Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
                CourseStore.allcourses.add(name_course);
            }
            File file1 = new File(directory+"room/");
            File[] listofFiles1 = file1.listFiles();
            for (int i = 0; i < listofFiles1.length; i++) {
                File infile1 = new File(directory+"room/" + listofFiles1[i].getName());
                FileReader fileReader1 = new FileReader(infile1);
                BufferedReader reader = new BufferedReader(fileReader1);
                line = reader.readLine();
                data = line.split(" ");
                Professor professor = new Professor(Integer.parseInt(data[0]),data[1], data[2]);
                ProfessorStore.allrooms.add(professor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public boolean isEmptyDirectory(){
        File dir = new File(directory);
        String files[] = dir.list();
        return files.length == 0;
    }

    public boolean isDirectoryExists(){
        File dir1= new File(directory+"cour/");
        File dir2= new File(directory+"professor/");
        if (dir1.exists() & dir2.exists()){
            System.out.println("Директория существует");
            return true;
        }
        else return false;
    }

    public void createDirectory(){
        File dir1 = new File(directory+"cour/");
        File dir2 = new File(directory+"professor/");
        if(isDirectoryExists()==false){
            dir1.mkdir();
            dir2.mkdir();
            System.out.println("Директория создана");
        }
    }

    public void GenerateComputersAndRooms(){
        Name_course name_course = new Name_course(111, 1, 1, "IT");
        CourseStore.allcomputers.add(name_course);
        write(name_course);
        Name_course name_course1 = new Name_course(222, 1, 2, "Ekonom");
        CourseStore.allcomputers.add(name_course1);
        write(name_course1);
        Name_course name_course2 = new Name_course(333, 2, 1, "Liter");
        CourseStore.allcomputers.add(name_course2);
        write(name_course2);
     
        Professor professor1 = new professor(1, "Ilia", "Repin");
        ProfessorStore.allrooms.add(professor1);
        write(professor1);
        Professor professor2 = new professor(2, "Kirill", "Sern");
        ProfessorStore.allrooms.add(professor2);
        write(professor2);
        System.out.println("Директория заполнена");
    }
}