package grpc.service;

import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import org.springframework.security.core.parameters.P;
import proto.chat.ChatMessage;
import proto.chat.ChatServiceGrpc;
import proto.chat.Empty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {
    List<String> usersInChat = new ArrayList<>();
    //Map<String,StreamObserver<ChatMessage>> observers = new HashMap<>();
    List<StreamObserver<ChatMessage>> observers = new ArrayList<>();
    @Override
    public void sendMsg(proto.chat.ChatMessage request,
                        io.grpc.stub.StreamObserver<proto.chat.Empty> responseObserver) {

        System.out.println(request.getFrom());
        System.out.println(request.getTo());
        System.out.println(request.getMsg());
        String from = request.getFrom();
        String to = request.getTo();
        String msg = request.getMsg();
        Boolean typing = request.getTyping();

        for(StreamObserver<ChatMessage> so: observers) {
            so.onNext(request);
            ServerCallStreamObserver serverCallStreamObserver = ((ServerCallStreamObserver<proto.chat.Empty>) responseObserver);
            serverCallStreamObserver.setOnCancelHandler(() -> System.out.println("error"));

        }
        //for(String userInChat: usersInChat){
         //   if(to.equals(userInChat)){
          //      System.out.println("send to  "+userInChat);
         //       observers.get(userInChat).onNext(request);
         //   }
      //  }
        Empty response = Empty.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void receiveMsg(proto.chat.UserInChat request,
                           io.grpc.stub.StreamObserver<proto.chat.ChatMessage> responseObserver) {

        //if(!observers.contains(responseObserver)){
            System.out.println("receive");
            observers.add(responseObserver);
        //}
        //if(!observers.containsKey(request.getUsername())){
           // observers.put(request.getUsername(),responseObserver);
          //  System.out.println("receive "+ request.getUsername());
       // }
      //  if(!usersInChat.contains(request.getUsername())){
       //     usersInChat.add(request.getUsername());
      //  }
    }


}
