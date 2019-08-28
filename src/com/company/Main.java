package com.company;

import com.company.impl.IBase;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        NonAbstractClass nonAbstractClass = new NonAbstractClass();
        nonAbstractClass.writeClassName();

        Student student = new Student();
        student.writeClassName();

    }
}

class Student extends AbstractBaseClass {
    @Override
    public int sumTwoNumber() {
        return 8 + 9;
    }

    @Override
    public void writeClassName() {
        System.out.println("Student");
    }
}

class NonAbstractClass extends AbstractBaseClass implements IBase {

    private String id;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }

    @Override
    public int sumTwoNumber() {
        return 5 + 6;
    }

    @Override
    public void writeClassName() {
        System.out.println("NonAbstractClass");
    }
}

abstract class AbstractBaseClass {
    public Date createdDate;
    private boolean deleted;
    private Date updateDate;

    public abstract int sumTwoNumber();

    public void writeClassName() {
        System.out.println("AbstractBaseClass");
    }

}