package com.company;

class CouncilStudent extends Student {
    protected String position;
    public CouncilStudent(String name,String p_position)
    {
        super(name);
        position=p_position;
    }
    @Override
    public String get_name(){return super.get_name()+ "("+position+")" ;}
}
