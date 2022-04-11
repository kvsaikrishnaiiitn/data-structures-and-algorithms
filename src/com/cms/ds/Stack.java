package com.cms.ds;

public interface Stack<X> {

	// insert,delete,size,search

	X push(X element);

	X pop();

	int size();

	X find(X element);

}
