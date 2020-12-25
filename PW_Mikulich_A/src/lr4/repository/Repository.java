package repository;

import domain.Account;

public interface Repository<E>{
    void write(Account out) ;
    void read();

    boolean isDirectoryExists();

    boolean isEmptyDirectory();

    void createDirectory();

    void GenerateDir();
}