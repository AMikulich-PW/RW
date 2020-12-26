package lr5;

import lr5.repository.*;
import lr5.service.*;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;



@Configuration
@EnableRabbit
public class Config {

    @Bean
    public Repository getRepository(){
        return new FileRepository();
    }

    @Bean
    public CourseService getCourseService(){
        return new FileCourseService();
    }

    @Bean
    public ProfessorService getRoomService(){return new FileProfessorService();}

    @Bean
    public ConnectionFactory connectionFactory() {
        ConnectionFactory connection = new CachingConnectionFactory("localhost");
        return connection;
    }



    @Bean
    public Queue myQueue1() {
        return new Queue("forservice1");
    }

    @Bean
    public Queue myQueue2() {
        return new Queue("forservice2");
    }

    @Bean
    public FanoutExchange fanoutExchangeA(){
        return new FanoutExchange("exchangeA");
    }

    @Bean
    public Binding binding1(){
        return BindingBuilder.bind(myQueue1()).to(fanoutExchangeA());
    }

    @Bean
    public Binding binding2(){
        return BindingBuilder.bind(myQueue2()).to(fanoutExchangeA());
    }

}
