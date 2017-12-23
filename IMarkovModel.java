import java.util.*;
import java.util.Random;
/**
 * Write a description of IMarkovModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMarkovModel {
    
    public void setRandom(int seed);
   
    public void setTraining(String s);
    
    public String getMyText();
    
    public Random getMyRandom();
    
   
}
