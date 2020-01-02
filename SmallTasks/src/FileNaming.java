import java.util.ArrayList;
import java.util.List;

public class FileNaming {
    //You are given an array of desired filenames in the order of
    // their creation. Since two files cannot have equal names,
    // the one which comes later will have an addition to its name
    // in a form of (k), where k is the smallest positive integer
    // such that the obtained name is not used yet.
    //Return an array of names that will be given to the files.
    String[] fileNaming(String[] names) {

        List<String> list = new ArrayList<>();

        for(String s : names){
            if(!list.contains(s))
                list.add(s);
            else
                for(int i = 1; i < names.length; i++){
                    if(list.contains(s + "(" + i + ")")){
                        continue;
                    }
                    list.add(s + "(" + i + ")");
                    break;
                }
        }
        return list.toArray(names);
    }


}
