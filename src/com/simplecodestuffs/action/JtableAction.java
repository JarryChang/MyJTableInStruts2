package com.simplecodestuffs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.simplecodestuffs.model.Student;

public class JtableAction {
	private List<Student> records = new ArrayList<Student>();
    public List<Student> getRecords() {
		return records;
	}
    
    public String list() {
        // Add data to Student list
        records.add(new Student(1, "Haripriya", "IT", "xyz@xyz.com"));
        records.add(new Student(2, "Dinesh", "ECE", "xyz@gmail.com"));
        records.add(new Student(3, "Prabhu", "MECH", "abc@gmail.com"));
        records.add(new Student(4, "Badru", "ECE", "efg@gmail.com"));
        records.add(new Student(5, "Lahir nisha", "CSC", "xyz@gmail.com"));
        records.add(new Student(6, "Nilafar nisha", "CSC", "123@gmail.com"));
        records.add(new Student(7, "Jamil", "ECE", "789@gmail.com"));
        records.add(new Student(8, "Mahes", "ECE", "123@gmail.com"));
        records.add(new Student(9, "Lourde", "IT", "xyz@gmail.com"));
        result = "OK";

        return Action.SUCCESS;
}
    
    
	public void setRecords(List<Student> records) {
		this.records = records;
	}
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	private String result;
    
    
}
