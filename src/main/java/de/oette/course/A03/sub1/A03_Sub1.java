package de.oette.course.A03.sub1;

import org.springframework.stereotype.Service;

import de.oette.course.A04.LuckyNumberGenerator;

@Service
public class A03_Sub1 implements LuckyNumberGenerator{
    

    public A03_Sub1(){
        System.out.println("sub1 Junge ");
    }

    @Override
    public int getMyNumber() {
        // TODO Auto-generated method stub
        return 18;
    }
}
