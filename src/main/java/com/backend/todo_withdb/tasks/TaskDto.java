package com.backend.todo_withdb.tasks;

import jakarta.annotation.Nullable;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {

    @Nullable
    Long id;
    @Nullable
    String  name;
    @Nullable
    Date dueDate;
    @Nullable
    Boolean done;

}
