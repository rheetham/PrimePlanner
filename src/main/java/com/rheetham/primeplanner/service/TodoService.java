package com.rheetham.primeplanner.service;

import com.rheetham.primeplanner.request.TodoRequest;
import com.rheetham.primeplanner.response.TodoResponse;

import java.util.List;

public interface TodoService {
    List<TodoResponse> getAllTodos();
    TodoResponse createTodo(TodoRequest todoRequest);
    TodoResponse toggleTodoCompletion(long id);
    void deleteTodo(long id);
}
