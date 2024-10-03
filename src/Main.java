import chainOfResponsability.middleware.CheckPermissionMiddleware;
import chainOfResponsability.middleware.Middleware;
import chainOfResponsability.middlewares.CheckUserMiddleware;
import chainOfResponsability.server.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("amanda@gmail.com", "123");
        server.registerUser("testeRegister", "123");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) {
        init();

        boolean done;

        try {
            do {
                System.out.println("Digite o e-mail:");
                String email = reader.readLine(); // pode lançar IOException
                System.out.println("Digite a sua senha:");
                String password = reader.readLine(); // pode lançar IOException
                done = server.logIn(email, password);
            } while (!done);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na leitura dos dados: " + e.getMessage());
        }
    }
}