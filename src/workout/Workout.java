package workout;

class  person{
    String username;
    String password;
    person(String username , String password){
          this.username = username;
          this.password = password;
    }
}
class user extends person{
    
    public user(String username, String password) {
        super(username, password);
    }
    void login(){
        System.out.println("Enter your username : ");
         
    }
    
}
public class Workout {

    
    public static void main(String[] args) {
        
    }
    
}
