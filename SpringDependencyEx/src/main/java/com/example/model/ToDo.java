package com.example.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter 
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class ToDo {
	 String name;
	 String id;
	
	 public ToDo(String name)
	 {
		 this.id=UUID.randomUUID().toString();
		 this.name=name;
	 }
}
