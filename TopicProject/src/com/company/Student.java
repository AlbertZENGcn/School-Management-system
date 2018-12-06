package com.company;

class Student implements iGetname{
    public int id;
    protected  String name;
    public Student(String p_name) {name=p_name; }
    public  String get_name(){return name;}
    public  void set_name(String p_name){name=p_name;}
    public  String get_role(){return"Student";}
}
