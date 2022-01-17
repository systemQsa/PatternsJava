package com.creational.prototype;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Project implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id,projectName,sourceCode);
        return copy;
    }
}
