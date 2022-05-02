package de.oette.course.A03.sub2;

import org.springframework.stereotype.Component;

import de.oette.course.A04.LuckyNumberGenerator;

@Component
public class A03_Sub2 implements LuckyNumberGenerator {
    
    public A03_Sub2(){
        System.out.println("sub2 Junge ");
    }

    @Override
    public int getMyNumber() {
        // TODO Auto-generated method stub
        return 53;
    }
}
