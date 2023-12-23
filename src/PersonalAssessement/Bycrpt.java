package PersonalAssessement;

public class Bycrpt {
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

    public class PasswordHashingExample {

        public static void main(String[] args) {
            // Generate a random salt
            String salt = BCryptPasswordEncoder.BCryptVersion.$2A.encode("someRandomSalt");

            // Hash the password with the salt
            String password = "userPassword";
            String hashedPassword = new BCryptPasswordEncoder().encode(salt + password);

            // Store both the hashed password and the salt in the database

            // During login verification
            String enteredPassword = "userEnteredPassword";
            String computedHash = new BCryptPasswordEncoder().encode(salt + enteredPassword);

            // Compare computedHash with the stored hashed password
            if (computedHash.equals(hashedPassword)) {
                System.out.println("Password is correct");
            } else {
                System.out.println("Password is incorrect");
            }
        }
    }

}
