package library;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

                Server server = ServerBuilder.
                        forPort(9090).addService(new LibraryService()).build();

                server.start();
                System.out.println("Server strated at  " + server.getPort());
                server.awaitTermination();
            }
    }
