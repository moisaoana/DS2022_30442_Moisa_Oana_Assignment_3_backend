package grpc.server;

import grpc.service.ChatServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.ServerCallStreamObserver;

public class ChatServer {
    public static void main(String[] args) throws Exception{
        final int PORT = 9090;

        Server server = ServerBuilder.forPort(PORT)
                .addService(new ChatServiceImpl())
                .build();

        server.start();

        System.out.println("Server started...");

        server.awaitTermination();
    }
}
