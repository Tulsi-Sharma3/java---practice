package OOPs_in_java;

class Subject{
    private String c;
    private int marks;

    public Subject(String Subject_name, int marks){
        this.Subject_name = Subject_name;
        this.marks = marks;
    }

    public String getSubject(){
        return Subject_name;
    }

    public int getMarks(){
        return marks;
    }

}

class Student{

    private String name;
    private int rollNo; 
    private Subject[] sub;

    public Student(String name,int rollNo,Subject[] sub){
        this.name = name;
        this.rollNo = rollNo; 
        this.sub = sub;

    }
    
    public double cal_per(){
        int total = 0;
        for(int i=0; i<subjects.length; i++){
            total += subjects[i].getMarks();
        }
        return total/3.0;
    }

    public getgrade(){
        double per = cal_per();

        if(per>=75){
            return "A";
        }
        elseif(per>=65){
            return "B";
        }
        elseif(per>=50){
            return "C";
        }
        else{
            return "Fail";
        }

        public void display(){
            System.out.println("name : " + name);
            System.out.println("roll_no : " + rollNo);
            System.out.println("percentage : " + cal-per());
            System.out.println("Grade: " + getgrade());
            System.out.println( );
        }
    }

}


public class Topper_Student {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setSubject = "math";
        s2.setSubject = "sci";
        s3.setSubject = "java";

        s1.display();
    }
}
