package company;

public class Parttimeworker implements Workable{
    protected final String name;
    private final Department department;
    
    public Parttimeworker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    @Override
    public void work() {
        System.out.println("アルバイトとして働きます。名前：" + name + slogan);
    }
}
