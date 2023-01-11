package ro.tuc.ds2020;

import grpc.service.ChatServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.annotation.Validated;
import ro.tuc.ds2020.services.MeasurementService;
import ro.tuc.ds2020.services.ReceiverService;


import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.TimeZone;

@SpringBootApplication
@Validated
public class Ds2020Application extends SpringBootServletInitializer {


    private static ReceiverService receiverServiceStatic;

    @Autowired
    private ReceiverService receiverService;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Ds2020Application.class);
    }

    @PostConstruct
    public void init() {
        Ds2020Application.receiverServiceStatic = receiverService;
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(Ds2020Application.class, args);
        receive();
        try {
            //startServer();
        }catch(Exception e){
            e.printStackTrace();
        }

        final int PORT = 9090;

        Server server = ServerBuilder.forPort(PORT)
                .addService(new ChatServiceImpl())
                .build();

        server.start();

        System.out.println(server.getPort());

        System.out.println("Server started...");


        server.awaitTermination();
        System.out.println(server.getPort());
    }

    public static void receive(){
        //ReceiverService receiverService = new ReceiverService();
        System.out.println("here");
        try {
            receiverServiceStatic.receive();
        } catch (Exception e) {
            e.printStackTrace();
           // receive();
        }
    }

    private static void startServer() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new ChatServiceImpl())
                .build();

        // Start the server
        server.start();

        // Server threads are running in the background.
        System.out.println("Server started...");
        // Don't exit the main thread. Wait until server is terminated.
        server.awaitTermination();
    }
}
