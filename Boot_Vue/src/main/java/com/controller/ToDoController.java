package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exception.NoItemFoundException;
/*import com.model.Item;
import com.service.ItemService;*/

@Controller
public class ToDoController {

	/*@Autowired
	ItemService itemService;
	
	
	
	@RequestMapping(value= "/simple-todo-item", method= RequestMethod.GET)
	public String simpleToDoItem() {
		return "simple-todo-item";
	}
	
	@ResponseBody
	@RequestMapping(value= "/list-todo-item", method= RequestMethod.GET)
	public List<Item> toDoList() throws NoItemFoundException{
		List<Item>  itemsList= itemService.findAllItem();
		
		HttpHeaders httpHeaders= new HttpHeaders();
		
		if(itemsList.size() == 0) {
			throw new NoItemFoundException("No item found");
		}else {
			return itemsList;
		}
	}*/
}
