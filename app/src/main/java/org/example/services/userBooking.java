package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.user;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class userBooking {

    private user User;

    private List<user>userList;
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String USER_PATH = "../localdb/users.json";
    public userBooking(user User1) throws IOException {
        this.User = User1;
        File users = new File(USER_PATH);
        userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<user>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        });
    }
}
