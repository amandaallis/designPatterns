package chainOfResponsability.middleware;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("amanda@gmail.com")) {
            System.out.println("Bem vindo, Administrador! ");
            return true;
        }
        System.out.println("Bem vindo");
        return checkNext(email, password);
    }
}