import java.util.*;
import edu.duke.*;
/**
 * Write a description of MarkovOneTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarkovOneTester {
    
    
    public void testGetFollows(){
        /*MarkovOne one = new MarkovOne();
        one.setTraining("this is a test yes this is a test.");
        ArrayList<String> result= one.getFollows("t");  
        for(String item : result){
            System.out.println(item);
        }*/
    }
    
    public void testGetFollowsWithInterface(){
        MarkovModel markov= new MarkovModel(1);
        markov.setTraining("this is a test yes this is a test.");
        ArrayList<String> result= markov.getFollows("t");  
        for(String item : result){
            System.out.println(item);
        }
        
    }
    
    public void testGetFollowsWithFile(){
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovOne one = new MarkovOne();
        one.setTraining(st);
        ArrayList<String> result= one.getFollows("th");
        System.out.println(result.size());
       /* for(String item : result){
            System.out.println(item);
        }*/
    }
    
    
}
