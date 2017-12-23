import java.util.*;
import java.util.Random;
/**
 * Write a description of AbstractMarkovModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstractMarkovModel implements IMarkovModel {
    protected String myText;
    protected Random myRandom;
    
    public AbstractMarkovModel(){
        myRandom = new Random();
    }
    
    public void setTraining(String text){
        myText= text;
    }
    
    abstract public String getRandomText(int numChars);
    
    protected ArrayList<String> getFollows(String key){
        ArrayList<String> result= new ArrayList<String>();
        for(int i =0; i< this.getMyText().length()-key.length();i++){
            int leng= key.length();
            String temp= this.getMyText().substring(i,key.length()+i);
            if(key.equals(temp)){
               //if(arrs[key.length()]!=null){
                   result.add(Character.toString(this.getMyText().charAt(key.length()+i)));
               //}
            }
        
        }
        return result;
    }
    
}
