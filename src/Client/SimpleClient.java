package Client;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port)) {
            // Output stream to send message to server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Hello from client!");

            // Input stream to receive server response
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = input.readLine();

            System.out.println("Received from server: " + response);

            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
