import java.util.*;
import java.util.Random;
/**
 * Write a description of MarkovFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarkovFour {
 private String myText;
    private Random myRandom;
    
    public MarkovFour() {
        myRandom = new Random();
    }
    
    public void setRandom(int seed){
        myRandom = new Random(seed);
    }
    
    public void setTraining(String s){
        myText = s.trim();
    }
    
    public ArrayList<String> getFollows(String key){
        ArrayList<String> result= new ArrayList<String>();
        for(int i =0; i<myText.length()-key.length();i++){
            int leng= key.length();
            String temp= myText.substring(i,key.length()+i);
            if(key.equals(temp)){
               //if(arrs[key.length()]!=null){
                   result.add(Character.toString(myText.charAt(key.length()+i)));
               //}
            }
        
        }
        return result;
    }
    
    public String getRandomText(int numChars){
        if (myText == null){
            return "";
        }
        int index= myRandom.nextInt(myText.length()-4);
        String key= myText.substring(index,index+4); 
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        for(int k=0; k < numChars-4; k++){
            ArrayList<String> follows= getFollows(key);
            if(follows.size()==0){
                break;
            }
             index = myRandom.nextInt(follows.size());
             String next= follows.get(index);
            sb.append(next);
            key= key.substring(1) + next;
        }
        
        
        return sb.toString();
    }
    
}
