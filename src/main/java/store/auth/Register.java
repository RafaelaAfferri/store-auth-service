package store.auth;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder
@Data @Accessors(fluent = true)
public class Register implements Serializable{

    private String id;
    private String name;
    private String email;
    private String password;
    
}
