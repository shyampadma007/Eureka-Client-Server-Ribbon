package com.example.microservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
  @Autowired
  private RestTemplate restTemplate;
  //public List<Account> showEmployees(@PathVariable("id") String id) {
  public String showEmployees(@PathVariable("id") String id) {  
  System.out.println(id);
    //List<Account> accounts = new RestTemplate().exchange(
    //"http://localhost:9000/accounts/{empId}", HttpMethod.GET, null, new
    //ParameterizedTypeReference<List<Account>>(){}, id).getBody();
    return "success one";
		/*
		 * List<Account> accounts = restTemplate.exchange(
		 * "http://ACCOUNT/accounts/{empId}", HttpMethod.GET, null, new
		 * ParameterizedTypeReference<List<Account>>(){}, id).getBody(); return
		 * accounts;
		 */       
  }
}