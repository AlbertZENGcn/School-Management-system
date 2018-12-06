package com.company;

class Management {
    public iGetname all_of_names[];
    public int n_name;
    public Student all_of_students[];
    public int n_student;
    public Professor all_of_stuffs[];
    public Course all_of_courses[];
    public int n_stuff;
    public int n_course;
    public int all_of_marks[];
    public int n_mark;
    public int mark;
    public  Management()
    {
        all_of_names=new iGetname[10000];
        all_of_students=new Student[10000];
        all_of_courses=new Course[10000];
        all_of_stuffs=new Professor[10000];
        all_of_marks=new int[10000];
        n_course=0;
        n_name=0;
        n_stuff=0;
        n_student=0;
        n_mark=0;
    }
    public void add_students(String name)
    {
        all_of_students[n_student++]=new Student(name);
        all_of_names[n_name++]= all_of_students[n_student-1];
    }
    public void add_professor(String name)
    {
        all_of_stuffs[n_stuff++]=new Professor(name);
        all_of_names[n_name++]= all_of_stuffs[n_student-1];
    }
    public void add_courses(String name)
    {
        all_of_courses[n_course++]=new Course(name);

    }
    public void add_students_(String name,String position)
    {
        all_of_students[n_student++]=new CouncilStudent(name,position);
        all_of_names[n_name++]= all_of_students[n_student-1];
    }
    public void add_professor(String name,String position)
    {
        all_of_stuffs[n_stuff++]=new InventedProfessor(name,position);
        all_of_names[n_name++]= all_of_stuffs[n_student-1];
    }
    public void assign_lecture(int id_prof,int id_course)
    {
        all_of_courses[id_course].set_professor(all_of_stuffs[id_prof]);
    }
    public void enroll_student(int id_student,int id_course)
    {
        all_of_courses[id_course].add_student(all_of_students[id_student]);
    }
    public void mark_student(int id_course,int id_student,int mark)
    {
        all_of_courses[id_course].add_studentmark(all_of_students[id_student]);
        this.mark=mark;
    }
    public void show_detail_course(int id_course)
    {
        all_of_courses[id_course].show_description();
    }
    public void show_courses()
    {
        System.out.println("Course list:");
        for(int i=0;i<n_course;i++)
        {
            System.out.println("Course id"+i+" :"+all_of_courses[i].get_name());
        }
    }
    public void show_students()
    {
        System.out.println("Student list:");
        for(int i=0;i<n_student;i++)
        {
            System.out.println("Student id"+i+" :"+all_of_students[i].get_name());
        }
    }
    public void show_professors()
    {
        System.out.println("Professors list:");
        for(int i=0;i<n_stuff;i++)
        {
            System.out.println("Stuff id"+i+" :"+all_of_stuffs[i].get_name());
        }
    }
    public void show_names()
    {
        System.out.println("Name list:");
        for(int i=0;i<n_name;i++)
        {
            System.out.println(all_of_names[i].get_role()+":"+all_of_names[i].get_name());
        }
    }
    public void show_marks(int id_student, int id_course)
    {
        System.out.println("Marks:");
        int i1=id_course;
        int i2=id_student;
            System.out.println(all_of_courses[i1].get_name()+" "+all_of_students[i2].get_name()+" "+mark);
    }
}
