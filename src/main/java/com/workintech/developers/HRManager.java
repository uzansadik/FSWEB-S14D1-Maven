package com.workintech.developers;

public class HRManager extends Employee {

    JuniorDeveloper[] juniorDevelopers;
    MidDeveloper[] midDevelopers;
    SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HRManager starts to work");
    }

    public void addEmployee(JuniorDeveloper developer, int index){
        try{
            if(this.juniorDevelopers[index] == null){
                this.juniorDevelopers[index] = developer;
            }else {
                System.out.println("JuniorDeveloper already exists");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Junior developer array is full. You are not allowed to add more");
        }
    }

    public void addEmployee(MidDeveloper developer, int index){
        try{
            if(this.midDevelopers[index] == null){
                this.midDevelopers[index] = developer;
            }else {
                System.out.println("MidDeveloper already exists");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Mid developer array is full. You are not allowed to add more");
        }
    }

    public void addEmployee(SeniorDeveloper developer, int index){
        try{
            if(this.seniorDevelopers[index] == null){
                this.seniorDevelopers[index] = developer;
            }else {
                System.out.println("SeniorDeveloper already exists");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Senior developer array is full. You are not allowed to add more");
        }
    }
}
