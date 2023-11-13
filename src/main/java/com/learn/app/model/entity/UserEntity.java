package com.learn.app.model.entity;

import com.learn.app.util.PrimaryKeyUtil;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("user")
@Data
@Builder
public class UserEntity implements Persistable<String> {

    @Id
    private String id;

    private String name;
    private String mobile;
    private String email;

    @Override
    public boolean isNew() {

        boolean isNew = Objects.isNull(id);
        this.id = isNew ? PrimaryKeyUtil.getUniquePrimaryKey() : this.id;
        return isNew;
    }
}
