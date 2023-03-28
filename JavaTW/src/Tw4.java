class Employ{
    String name,address,gender;
    int age;
    double sal;
    Employ(String name,int age,String address,String gender){
        this.name=name;
        this.age=age;
        this.address=address;
        this.gender=gender;
    }
    
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Gender:"+gender);
        System.out.println("Salay:"+sal);
    }
}

class FTEmploy extends Employ{
    int basSal;
    FTEmploy(String name,int age,String address,String gender,int basSal){
        super(name,age,address,gender);
        this.basSal=basSal;
    }

    void calSal(){
        sal=(basSal+basSal*0.75+basSal*0.075-basSal*0.1);
    }
}

class PTEmploy extends Employ{
    String qual;
    int exp,numHour;
    PTEmploy(String name,int age,String address,String gender,String qual,int exp,int numHour){
        super(name,age,address,gender);
        this.qual=qual;
        this.exp=exp;
        this.numHour=numHour;
    }

    void calSal(){
        switch(qual){
            case "BE":
                if(exp<=5) sal=numHour*300;
                else if(exp<=10) sal=numHour*400;
                else sal=numHour*500;
                break;
            case "MTech":
                if(exp<=5) sal=numHour*500;
                else if(exp<=10) sal=numHour*700;
                else sal=numHour*1000;
                break;
            case "PhD":
                if(exp<=5) sal=numHour*800;
                else if(exp<=10) sal=numHour*1200;
                else sal=numHour*1500;
                break;
        }
    }
}

public class Tw4{
    public static void main(String []args){
        FTEmploy f1=new FTEmploy("Arun",25,"Vijayapur","Male",10000);
        f1.calSal();
        System.out.println("Details of Full time Employ");
        f1.show();
        PTEmploy e1=new PTEmploy("Rohit",30,"Belgum","Male","BE",6,10);
        e1.calSal();
        System.out.println("\nDetails of Part time Employ 1:");
        e1.show();
        PTEmploy e2=new PTEmploy("Rohini",26,"Mysore","Female","PhD",10,8);
        e2.calSal();
        System.out.println("\nDetails of Part time Employ 2:");
        e2.show();
    }
} 