package ru.nastia.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = context.getBean("User", User.class);
        Product product1 = context.getBean("Product",Product.class);
        Basket basket1 = context.getBean("Basket", Basket.class);

        System.out.print(user1.getName()+" ");
        System.out.println(user1.getEmailAddress());

        System.out.print(product1.getProductType()+" ");
        System.out.print(product1.getProductName()+" ");
        System.out.println(product1.getPrice());

        System.out.print(basket1.getNumberOfItems()+" ");
        System.out.println(basket1.getTotalCost());

        context.close();
    }
}
