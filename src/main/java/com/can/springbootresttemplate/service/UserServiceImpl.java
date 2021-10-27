package com.can.springbootresttemplate.service;

import com.can.springbootresttemplate.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public User create(User user) {


        String url = "http://localhost:8080/usercontroller/add";

        ResponseEntity<User> result = restTemplate.postForEntity(url, user, User.class);
        User responseBody = result.getBody();
        return responseBody;
    }

    public List<User> getAll() {
        String url = "http://localhost:8080/usercontroller/getall";

        ResponseEntity<List> result = restTemplate.getForEntity(url, List.class);
        List<User> responseBody = result.getBody();
        return responseBody;
    }

    @Override
    public User getUserById(int id) {
        String url = "http://localhost:8080/usercontroller/user/" +id;

        ResponseEntity<User> result = restTemplate.getForEntity(url, User.class);
        User responseBody = result.getBody();
        return responseBody;
    }

    @Override
    public User getUserByEmail(String email) {
        String url = "http://localhost:8080/usercontroller/getbyemail/" +email;

        ResponseEntity<User> result = restTemplate.getForEntity(url, User.class);
        User responseBody = result.getBody();
        return responseBody;
    }

    @Override
    public void delete(Integer userId) {
        String url = "http://localhost:8080/usercontroller/getbyid/" + userId;


//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<User> entity = new HttpEntity<User>(headers);
//
//        return restTemplate.exchange(
//                url, HttpMethod.DELETE, entity, String.class).getBody();
        restTemplate.delete(url);

    }
}
