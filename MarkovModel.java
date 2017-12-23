import java.util.*;
import java.util.Random;
/**
 * Write a description of MarkovModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarkovModel extends AbstractMarkovModel {
    private int myOrder;
    private Random myRandom;
    
    public MarkovModel(int order){
        myOrder=order;
    }
    
    public String getRandomText(int length){
        StringBuffer sb= new StringBuffer();
        int index= myRandom.nextInt(myText.length()- myOrder);
        String current= myText.substring(index, index +myOrder);
        sb.append(current); 
        for(int k=0;k<length-myOrder;k++){
            ArrayList<String> follows= getFollows(current);;
            
        }
        return current;
    }
    
    public void setRandom(int seed){
        myRandom = new Random(seed);
    }
    
    public void setTraining(String s){
        myText = s.trim();
    }
    
    public String getMyText(){
        return myText;
    }
    
    public Random getMyRandom(){
        return myRandom;
    }
    
}
