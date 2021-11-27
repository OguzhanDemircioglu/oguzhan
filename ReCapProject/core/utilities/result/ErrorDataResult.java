package com.etiya.RentACarSpring.RentACar.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {
	public ErrorDataResult(T data, String message){
		super(data,false,message);
	}
	public ErrorDataResult(T data){
		super(data,false);
	}
}
