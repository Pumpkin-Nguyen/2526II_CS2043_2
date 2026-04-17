class UserService {
    public User findById(int id) { return null; }
}

class User {}

class EmailService {
    public void sendWelcomeEmail(User user) {}
}

class UserRender {
    public void renderUserProfile(User user) {}
}

class UserExporter {
    public String exportUserToCsv(User user) { return null; }
}