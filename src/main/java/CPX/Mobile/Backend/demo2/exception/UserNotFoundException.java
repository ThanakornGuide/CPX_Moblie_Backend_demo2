package CPX.Mobile.Backend.demo2.exception;

public class UserNotFoundException extends Exception {
    
    public UserNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
