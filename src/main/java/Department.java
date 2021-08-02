public class Department {
    private int id;
    private  String title;
    private int avgSalary;

    public Department(int id, String title, int avgSalary) {
        this.id = id;
        this.title = title;
        this.avgSalary = avgSalary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(int avgSalary) {
        this.avgSalary = avgSalary;
    }


}
