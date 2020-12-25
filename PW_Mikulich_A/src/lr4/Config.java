
import repository.FileRepository;
import repository.Repository;
import service.AccountService;
import service.FileAccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Config {

    @Bean
    public Repository getRepository(){
        return new FileRepository();
    }

    @Bean
    public AccountService getAccountService(){
        return new FileAccountService();
    }


}