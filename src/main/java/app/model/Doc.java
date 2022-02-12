package app.model;

import org.springframework.stereotype.Component;

@Component("myDoc")
public class Doc extends Animal{
    @Override
    public String toString(){
            return "Im a Doc";
    }
}
