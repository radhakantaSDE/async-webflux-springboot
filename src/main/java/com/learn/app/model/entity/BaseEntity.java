package com.learn.app.model.entity;

import com.learn.app.util.PrimaryKeyUtil;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

import java.util.Objects;

@Data
@SuperBuilder
public class BaseEntity implements Persistable<String> {

    @Id
    private String id;

    @Override
    public boolean isNew() {

        boolean isNew = Objects.isNull(id);
        this.id = isNew ? PrimaryKeyUtil.getUniquePrimaryKey() : this.id;
        return isNew;
    }
}
