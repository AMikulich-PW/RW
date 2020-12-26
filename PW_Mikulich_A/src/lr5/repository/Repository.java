package lr5.repository;

import lr5.domain.Name_course;
import lr5.domain.Professor;

public interface Repository {
    void write(Name_course out);
    void write(Professor out);
    void read();

    void setDirectory(String s);

    boolean isDirectoryExists();

    boolean isEmptyDirectory();

    void GenerateComputersAndRooms();

    void createDirectory();
}