package com.example.demo.utils;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class MyExceptionHandler {

	LocalDateTime time;
	String message;
	String description;
	
	
	

}
