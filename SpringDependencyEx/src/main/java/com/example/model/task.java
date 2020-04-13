package com.example.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class task {
	
	public String TaskId;
	public ArrayList<ToDo> list =new ArrayList<ToDo>();
	{
		TaskId=UUID.randomUUID().toString();
	}
	
	public void addTodo(ToDo todo )
	{
		list.add(todo);
		System.out.println("ADDED YOU SUCKER");
	}
	
	public List<ToDo> DisplayAll(ToDo todo)
	{
		return list;
	}
	
	public void DeleteByName(ToDo todo)
	{
		Iterator<ToDo> itr=list.iterator();
		if(itr.equals(obj))
	}
}
