//package com.example.CustomerServiceJPA;
//
//
//import org.springframework.http.MediaType;
//import static org.hamcrest.Matchers.hasSize;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//
//@WebMvcTest(CustomerController.class)
//public class ServiceTest {
//
//@Autowired
//private MockMvc mockMvc;
//
//@MockBean
//private CustomerService service;
//
//@Test
//public void ReadOperation() throws Exception {
//	// Mock the behavior of service.getCust() to return a list
//	List<Customer> customerList = new ArrayList<>();
////    Customer john = new Customer();
////    john.setId(1L);
////    john.setCustname("John");
////    john.setAccount("Account1");
////
////    Customer alice = new Customer();
////    alice.setId(2L);
////    alice.setCustname("Alice");
////    alice.setAccount("Account2");
////
////    customerList.add(john);
////    customerList.add(alice);
//
//    // Mock the behavior of service.getCust() to return the list
//    when(service.getCust()).thenReturn(customerList);
//   
//
//    // Perform GET request to the endpoint and assert the response
//    mockMvc.perform(get("/getCust"))
//           .andExpect(status().isOk())
//           .andExpect(content().contentType(MediaType.APPLICATION_JSON)); // Assuming the response is JSON
//           /*.andExpect(jsonPath("$", hasSize(2))); // Assuming the response is a JSON array with two elements*/
//}
//
//@Test
//public void SaveService() throws Exception {
//	
//	    // Mock the behavior of service.saveCust() to return "Data saved successfully"
//	    when(service.saveCust(anyString(), anyString())).thenReturn("Data saved successfully");
//
//	    // Perform POST request to the endpoint with parameters and assert the response
//	    mockMvc.perform(get("/saveCust")
//	            .param("custname", "John")
//	            .param("account", "1234567890")) // Assuming these are the parameters required by your controller
//	           .andExpect(status().isOk())
//	           .andExpect(content().string(containsString("Data saved successfully")));
//}
//
//@Test
//public void deleteService() throws Exception {
//	when(service.deleteByCustname(anyString())).thenReturn("Data deleted successfully");
//	
//	mockMvc.perform(get("/deleteCust")
//			.param("cname", "John"))
//			.andExpect(content().string(containsString("Data deleted successfully")));
//
//	
//}
//@Test
//public void updateService() throws Exception {
//	when(service.updateCustname(anyString(),anyString())).thenReturn("Name updated successfully");
//	
//	mockMvc.perform(get("/updateCustname")
//			.param("oldName", "John")
//			.param("newName", "Hari"))
//			.andExpect(content().string(containsString("Name updated successfully")));
//
//	
//}
//
//}