package Upes.Lab_6.StudentRecords;

public class Student {
    private String name;
    private String grade;
    private String stuid;
    public Student(String stuid,String name,String grade){
        this.stuid=stuid;
        this.grade=grade;
        this.name=name;
    }
    public void dispalyinfo(){
        System.out.println("Student id is:"+stuid);
        System.out.println("Nmae:"+name);
        System.out.println("Grade"+grade);

    }

}