package Server;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept(); // accept client connection
            System.out.println("Client connected.");

            // Input stream to read message from client
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Output stream to send response to client
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message = input.readLine();
            System.out.println("Received from client: " + message);

            output.println("Hello from server!");

            // Close connections
            input.close();
            output.close();
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}