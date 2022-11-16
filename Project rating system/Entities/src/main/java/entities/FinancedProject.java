package entities;

import java.io.Serializable;
import java.util.Date;

public class FinancedProject implements Serializable {

    private ProjectRequest project;
    private Date dateOfAcceptance;

    public FinancedProject() {
        project = new ProjectRequest();
        dateOfAcceptance = new Date();
    }

    public FinancedProject(ProjectRequest project, Date dateOfAcceptance) {
        this.project = project;
        this.dateOfAcceptance = dateOfAcceptance;
    }

    public ProjectRequest getProject() {
        return project;
    }

    public void setProject(ProjectRequest project) {
        this.project = project;
    }

    public Date getDateOfAcceptance() {
        return dateOfAcceptance;
    }

    public void setDateOfAcceptance(Date dateOfAcceptance) {
        this.dateOfAcceptance = dateOfAcceptance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FinancedProject that = (FinancedProject) o;

        if (!project.equals(that.project)) return false;
        return dateOfAcceptance.equals(that.dateOfAcceptance);
    }

    @Override
    public int hashCode() {
        int result = project.hashCode();
        result = 31 * result + dateOfAcceptance.hashCode();
        return result;
    }
}
