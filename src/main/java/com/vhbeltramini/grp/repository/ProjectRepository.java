package com.vhbeltramini.grp.repository;

import com.vhbeltramini.grp.model.Project;
import com.vhbeltramini.grp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Integer>, JpaSpecificationExecutor<Project> {

    List<Project> findByCoordenador(User coordenador);

}