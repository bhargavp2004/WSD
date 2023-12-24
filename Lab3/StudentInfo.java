import java.io.Serializable;

public class StudentInfo implements Serializable {
    private int id;
    private String name;
    private String branch;

    public StudentInfo(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
