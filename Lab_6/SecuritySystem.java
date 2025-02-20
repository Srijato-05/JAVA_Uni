package Upes.Lab_6;

final class SecuritySystem
{
        public void authenticateUser(String username, String password)
        {
            if ("admin".equals(username) && "password123".equals(password))
                System.out.println("Authentication successful.");
            else
                System.out.println("Authentication failed.");
        }
}
