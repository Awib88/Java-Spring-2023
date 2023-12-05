import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Mood","something good!");
        trackList.put("Allez la france","Ramenez la coupe a la maison!");
        trackList.put("dry","dchsdhcgsdhcb!");
        trackList.put("heat","something dhfgeryhfgyusyhy!");

        System.out.println(trackList.get("dry"));

        Set<String> keys = trackList.keySet();
        for (String key : keys){
            System.out.printf("%s --> %s \n",key,trackList.get(key));
        }
    }
}