package clean.architecture.application.core.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class Programmer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;


    @Relationship(type = "FOLLOW", direction = Relationship.DIRECTION)
    public Set<Programmer> follows;

    /*
    //TODO:FOLLOW에 의한 무한루프 해결
    @Relationship(type = "FOLLOW", direction = Relationship.INCOMING)
    public Set<Programmer> following;
    */

    @Relationship(type = "USE", direction = Relationship.OUTGOING)
    public Set<Stack> stack;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
