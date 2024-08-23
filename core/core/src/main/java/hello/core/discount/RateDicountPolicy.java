package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDicountPolicy implements DiscountPolicy{

    private int discounPercent = 10; // 10% 할인(정률)

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discounPercent/100;
        }else return 0;
    }
}
