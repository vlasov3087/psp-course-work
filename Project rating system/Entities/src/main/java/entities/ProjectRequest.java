package entities;

import java.io.Serializable;
import java.util.Date;

public class ProjectRequest implements Serializable {

    private int id;
    private String name;
    private ProjectType projectType;
    private float cost;
    private float complexity;
    private Date dateOfIssue;
    private User user;

    public ProjectRequest() {
        name = "";
        projectType = new ProjectType();
        dateOfIssue = new Date();
        user = new User();
    }

    public ProjectRequest(int id, String name, ProjectType projectType, float cost, float complexity, Date dateOfIssue, User user) {
        this.id = id;
        this.name = name;
        this.projectType = projectType;
        this.cost = cost;
        this.complexity = complexity;
        this.dateOfIssue = dateOfIssue;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getComplexity() {
        return complexity;
    }

    public void setComplexity(float complexity) {
        this.complexity = complexity;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectRequest that = (ProjectRequest) o;

        if (id != that.id) return false;
        if (Float.compare(that.cost, cost) != 0) return false;
        if (Float.compare(that.complexity, complexity) != 0) return false;
        if (!name.equals(that.name)) return false;
        if (!projectType.equals(that.projectType)) return false;
        if (!dateOfIssue.equals(that.dateOfIssue)) return false;
        return user.equals(that.user);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + projectType.hashCode();
        result = 31 * result + (cost != +0.0f ? Float.floatToIntBits(cost) : 0);
        result = 31 * result + (complexity != +0.0f ? Float.floatToIntBits(complexity) : 0);
        result = 31 * result + dateOfIssue.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}
