package com.company.chapter19;

//19-2 깊은 복사를 위한 clone의 오버라이딩
public class Problem2 {

    public static void main(String[] args) {
       try {
           PersonalInfo original = new PersonalInfo("James", 22, "SimpeSound", "encoding");
           PersonalInfo copy = original.clone();

           original.showPersonalInfo();
           copy.showPersonalInfo();

       }catch(CloneNotSupportedException e) {
           e.printStackTrace();
       }
    }
}

class Business implements Cloneable{
    private String company;
    private String work;

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }
    public void showBusinessInfo(){
        System.out.println("회사: "+company);
        System.out.println("업무: "+work);
    }

    public Business clone() throws CloneNotSupportedException{
        Business bs = (Business) super.clone();
        return bs;
    }
}

class PersonalInfo implements Cloneable{
    private String name;
    private int age;
    private Business bz;

    public PersonalInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        this.bz = new Business(company,work);
    }

    public void showPersonalInfo(){
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
        bz.showBusinessInfo();
    }
    public PersonalInfo clone() throws CloneNotSupportedException{
        PersonalInfo pr = (PersonalInfo) super.clone();
        pr.bz = bz.clone();
        return pr;
    }

}




