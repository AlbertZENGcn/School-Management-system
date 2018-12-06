package com.company;

 class Professor implements iGetname {
public int id;
protected String name;
public Professor(String p_name){name=p_name;}

     public  String get_name(){return name;}
     public  void set_name(String p_name){name=p_name;}
     public  String get_role(){return"Professor";}
}
