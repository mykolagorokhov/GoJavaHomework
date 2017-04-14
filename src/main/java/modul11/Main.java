package modul11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MYKOLA.GOROKHOV on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        WorkWithFiles wwf= new WorkWithFiles();
        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        map.put("a","aa");



     //   System.out.println(wwf.replacer(map));
    //    wwf.fileContentReplacer(map);

    //    wwf.fileContentMerger(map);
        System.out.println("--------");
        System.out.println(wwf.checkWord("z"));

    }

}
