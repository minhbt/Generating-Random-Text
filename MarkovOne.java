import java.util.*;
import java.util.Random;
/**
 * Write a description of MarkovOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarkovOne  {
    private MarkovModel markov;
    
    public MarkovOne(){
        markov= new MarkovModel(1);
    }
    
    public String getRandomText(int numChars){
        if (markov.getMyText() == null){
            return "";
        }
        int index= markov.getMyRandom().nextInt(markov.getMyText().length()-1);
        String key= markov.getMyText().substring(index,index+1); 
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        for(int k=0; k < numChars-1; k++){
            ArrayList<String> follows= markov.getFollows(key);
            if(follows.size()==0){
                break;
            }
             index = markov.getMyRandom().nextInt(follows.size());
             String next= follows.get(index);
            sb.append(next);
            key= key.substring(1) + next;
        }
        
        
        return sb.toString();
    }
}
