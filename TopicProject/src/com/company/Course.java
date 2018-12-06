package com.company;

 class Course {
    private String name;
    public Professor lecturer;
    public Student list_student[];
    public int n_student;

    public Course(String p_name)
    {
        name= p_name;
        list_student= new Student[10000];
        n_student=0;
    }
    public  String get_name(){return name;}
    public  void set_name(String p_name){name=p_name;}
    public void  set_professor(Professor prof){lecturer =prof;}
     public void add_student(Student t)
     {
     for(int i=0;i<n_student;++i)
     {
         if(list_student[i]==t)
             return;
     }
         list_student[n_student++] = t;
     }
     public void add_studentmark(Student t) { list_student[n_student++] = t;}
     public void show_description() {
         System.out.println("[Course Name] " + this.get_name());
         System.out.println("[Professor] " + lecturer.get_name());
         for(int i = 0; i <= n_student; ++i) { System.out.println("[Student] "+ list_student[i].get_name()); }
     }

}
