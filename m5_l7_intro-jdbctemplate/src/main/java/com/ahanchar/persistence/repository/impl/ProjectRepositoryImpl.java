package com.ahanchar.persistence.repository.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ahanchar.persistence.model.Project;
import com.ahanchar.persistence.repository.IProjectRepository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Optional<Project> findById(Long id) {
        Project project = jdbcTemplate.queryForObject("SELECT id, name, date_created from project where id = ?", (resultSet, rowNum) -> new Project(resultSet.getLong("id"), resultSet.getString("name"), resultSet.getDate("date_created")
            .toLocalDate()), id);
        return Optional.ofNullable(project);
    }

    @Override
    public Project save(Project project) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        this.jdbcTemplate.update(connection -> {
            PreparedStatement statement = connection.prepareStatement("INSERT into project (name, date_created) values (?, ?)", new String[] { "id" });
            statement.setString(1, project.getName());
            statement.setDate(2, Date.valueOf(project.getDateCreated()));
            return statement;
        }, keyHolder);

        Long autogeneratedId = keyHolder.getKey()
            .longValue();

        return this.findById(autogeneratedId)
            .get();
    }

}
