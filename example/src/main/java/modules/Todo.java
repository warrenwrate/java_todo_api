package modules;

import java.util.Date;

public class Todo {

	private int id;
	private String description;
	private boolean complete;
	private Date dueDate;
	private String username;
	
	
	public Todo(int id, String description, boolean complete, Date dueDate, String username) {
		super();
		
		this.setId(id);
		this.setDescription(description);
		this.setComplete(complete);
		this.setDueDate(dueDate);
		this.setUsername(username);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public boolean isComplete() {
		return complete;
	}


	public void setComplete(boolean complete) {
		this.complete = complete;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	


}
