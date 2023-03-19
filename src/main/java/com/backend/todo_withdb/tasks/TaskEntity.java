package com.backend.todo_withdb.tasks;

import com.backend.todo_withdb.common.BaseEntity;
import com.backend.todo_withdb.notes.NotesEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity(name ="tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskEntity extends BaseEntity {


    @Column(name = "name",nullable = false)
    String name ;

    @Column(name = "due_date",nullable = false)
    Date dueDate;

    @Column(name = "done",nullable = false,columnDefinition = "boolean default false")
    boolean done;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    List<NotesEntity> notes;

}
