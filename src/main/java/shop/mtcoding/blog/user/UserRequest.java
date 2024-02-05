package shop.mtcoding.blog.user;

import lombok.Data;

public class UserRequest {

    @Data // getter, setter, tostring 다 있음
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;
    }

    @Data
    public static class LoginDTO {
        private String username;
        private String password;
    }
}
