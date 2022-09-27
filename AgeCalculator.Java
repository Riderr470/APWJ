import java.util.*;
import java.time.*;


class AgeCalculator (LocalDate date){

        LocalDate dob = LocalDate.of(1988, 12, 13); 
        LocalDate curDate = LocalDate.now();  
        Period period = Period.between(dob, curDate); 
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
        
    }
}