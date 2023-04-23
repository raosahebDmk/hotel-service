package com.ms.exception;

public class ResourceNotFound extends RuntimeException{
	
	public ResourceNotFound()
	{
		super("Hotel data not found in data server...");
	}
	
	public ResourceNotFound(String id)
	{
		super("Hotel id Not found in server: "+id);
	}

}
