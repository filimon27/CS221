package Assignment10;

public class Course {
    private String cid;
    private String cName;
    private int creditHours;

    public Course(String cid, String cName, int creditHours) {
        this.cid = cid;
        this.cName = cName;
        this.creditHours = creditHours;
    }

    public String getCid() {
        return cid;
    }

    public String getcName() {
        return cName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return  cid + '\'' +
                ", cName='" + cName + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }
}
