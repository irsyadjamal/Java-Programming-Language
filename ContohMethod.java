import java.util.Scanner;

/**
 *
 * @author Irsyad Jamal Pratama
 */
public class ContohMethod {
    private String username;
    private String password;
    Scanner scan = new Scanner(System.in);

    public ContohMethod() {
    }

    public ContohMethod(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void input(){
        System.out.print("Username: ");
        this.username = scan.nextLine();
        this.setUsername(username);
        System.out.print("Password: ");
        this.password = scan.nextLine();
        this.setPassword(password);
        
        this.login(username, password);
    }
    
    public boolean login(String username, String password){
        if(username == this.getUsername() && password == this.getPassword()){
            return true;
        } else {
            return false;
        }
    }
}
