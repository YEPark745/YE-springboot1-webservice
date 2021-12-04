package design.masil.practice.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) //Adding Auditing function in BaseTimeEntity class
public abstract class BaseTimeEntity {

    @CreatedDate // Automatic time saving when Entity is created and saved
    private LocalDateTime createdDate;

    @LastModifiedDate //Automatic saving- The last modified time
    private LocalDateTime modifiedDate;

}