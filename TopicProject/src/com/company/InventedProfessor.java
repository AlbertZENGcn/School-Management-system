package com.company;

class InventedProfessor extends Professor {
    protected String position;
    public InventedProfessor(String name,String p_position)
    {
        super(name);
        position=p_position;
    }
    @Override
    public String get_name(){return super.get_name()+ "("+position+")" ;}
}
