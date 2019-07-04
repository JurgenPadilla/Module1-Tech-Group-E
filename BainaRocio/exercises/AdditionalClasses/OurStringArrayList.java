package AdditionalClasses;

import java.util.Arrays;

public class OurStringArrayList {
    private String [] words;
    private int index;

    public OurStringArrayList(Integer size) {
        System.out.println("Created with size: "+size);
        this.words = new String[size];
        this.index = 0;
    }

    public void add(String value){
        System.out.println("Added word: "+value);
        this.words[index] = value;
        this.index++;
    }

    public void remove(Integer indexOfItem){
        System.out.println("remove item: "+indexOfItem);
        this.words[indexOfItem] = null;
    }

    public Integer size(){
        System.out.println("Returned size");
        int count = 0;
        int item=0;
        while (item< words.length){
            if(words[item]!=null){
                count++;
            }
            item++;
        }
        return new Integer(count);
    }
    public String get(Integer indexOfItem){
        System.out.println("Returned item: "+ indexOfItem);
        return this.words[indexOfItem];
    }

    @Override
    public String toString(){
        System.out.println("Return String");
        return Arrays.toString(words).replace(",","").replace(" null","");
    }

    public boolean contains(String word){
        System.out.println("Contains: "+ word);
        int item=0;
        while(item<words.length){
            if (words[item]!=null){
                if(words[item].equals(word)){
                    return true;
                }
            }
            item++;
        }
        return false;
    }
}
