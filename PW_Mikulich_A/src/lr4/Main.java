
import exception.NotEnoughMoneyException;
import exception.UnknownAccountException;
import service.*;
import store.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    Menu mn;

    @Autowired
    StoreService servicestore;

    public static void main(String[] args) throws NotEnoughMoneyException, UnknownAccountException {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        servicestore.startofwork();
        mn.showactions();
        for (;;){
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            mn.start(command);
            if (mn.flagexit) break;
       }
    }

}