package com.company.chapter16;

class Friends {
    protected String name;
    protected String phone;

    public Friends(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println("이름: "+name);
        System.out.println("전화: "+phone);
    }
}

class UnivFriend extends Friends{
    private String major;
    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: "+major);
    }
}

class CompFriend extends Friends{
    private String department;
    public CompFriend(String name, String phone, String dep) {
        super(name, phone);
        department =dep;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: "+department);
    }
}

public class MyFriends{
    public static void main(String[] args) {
        Friends[] frn = new Friends[10];
        int cnt =0;

        frn[cnt++] = new UnivFriend("Lee","010-1111-1111","computer");
        frn[cnt++] = new CompFriend("Cha","010-2222-2222","R&D");
        frn[cnt++] = new CompFriend("Kim","010-3333-3333","SW Dev");
        frn[cnt++] = new UnivFriend("Lee","010-4444-4444","Electronics");

        for(int i=0; i<cnt; i++){
            frn[i].showInfo();
            System.out.println();
        }
    }

}
