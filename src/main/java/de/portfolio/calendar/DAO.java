package de.portfolio.calendar;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class DAO implements MessageSourceAware
{
    private MessageSource messageSource;
    
    public void setMessageSource(MessageSource messageSource)
    {
        this.messageSource = messageSource;
    }
    
    public void print()
    {
        System.out.println(messageSource.getMessage("greeting",null, "Greeting", LocaleContextHolder.getLocale()));
    }
}