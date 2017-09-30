package de.portfolio.calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloBean")
public class Hello
{
    @Value("Hello World")
    private String string;
    
    public void setString(String string)
    {
        this.string = string;
    }
    
    public void print()
    {
        System.out.println(string);
    }
}