package ch.bbw.cge._06_program_flow;

public class LoginService {

    public boolean login(String username, String password) {
        // The order of these calls is visible in a sequence diagram.
        boolean usernameValid = validateUsername(username);
        boolean passwordValid = validatePassword(password);

        return usernameValid && passwordValid;
    }

    private boolean validateUsername(String username) {
        return username != null && !username.isBlank();
    }

    private boolean validatePassword(String password) {
        return password != null && password.length() >= 8;
    }
}
