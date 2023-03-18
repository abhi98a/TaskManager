package com.backend.todo_withdb.notes;

import com.backend.todo_withdb.common.BaseEntity;
import com.backend.todo_withdb.tasks.TaskEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name ="notes")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotesEntity extends BaseEntity {

    @Column(name = "title",nullable = false,length = 100)
    String title;
    @Column(name = "body ",nullable = false,length = 1000   )
    String body;


    @JoinColumn(name = "task_id")
    @ManyToOne(cascade = CascadeType.ALL)
    TaskEntity task;

}
