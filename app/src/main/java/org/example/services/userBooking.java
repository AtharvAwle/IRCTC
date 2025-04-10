package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.user;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class userBooking {

    private user User;

    private List<user>userList;
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String USER_PATH = "../localdb/users.json";
    public userBooking(user User1) throws IOException {
        this.User = User1;
        File users = new File(USER_PATH);
        userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<user>>() {});
    }

    public boolean loginUser(){
        Optional<user> foundUser  = userList.stream().filter(User1 -> {
            return User1.getName().equalsIgnoreCase(User1.getName()) && UserServiceUtil.checkPassword(User.getPassword(), User1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }
    public boolean signUp(user User1){
        try{
            userList.add(User1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }
    private void saveUserListToFile() throws IOException {
        File usersFile = new File(USER_PATH);
        OBJECT_MAPPER.writeValue(usersFile, userList);
    }
    public void fetchBooking(){
        User.printTickets();
    }
}
